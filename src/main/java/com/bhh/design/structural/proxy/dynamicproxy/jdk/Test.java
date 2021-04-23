package com.bhh.design.structural.proxy.dynamicproxy.jdk;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-23 18:47
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        ICup cup = new Cup();
        CupProxy proxy = new CupProxy(cup);
        // newCup 返回的是一个 $Proxy开头 的对象
        ICup newCup = (ICup) proxy.executor();

        // 这个对象在调用方法时, 会直接跳转到 invoke()方法
        newCup.drink();

        /*
         * 代理源码调试得知过程 : newProxyInstance() -> Proxy#getProxyClass0() (返回了被代理对象的Class对象) ->
         * 被调用的proxyClassCache.get()方法 (这个方法的作用就是若是缓存中存在已被代理对象, 则直接返回)->
         * 对缓存的查找, 若是没有则调用 factory.get()方法 , 这个方法其实调用了 Proxy 内部类 ProxyClassFactory.apply() 方法 ->
         * 对类的构建 (类型啊, 继承的接口啊 一系列), 最后是调用 defineClass0() 方法 完成构建
         */

        /*
         * cglib 和 jdk 区别
         *      jdk : 代理对象需要实现接口,
         *            代理生成的对象会直接实现被代理对象继承的接口,
         *            是通过反射机制生成实现接口的匿名类, 在调用具体方法前会调用 InvocationHandler来处理
         *      cglib : 代理对象不可是final类,
         *              代理生成的对象会直接继承被代理对象继承的类
         *              是利用asm对代理对象类的class文件进行字节码修改, 生成子类来进行处理
         */
    }
}
