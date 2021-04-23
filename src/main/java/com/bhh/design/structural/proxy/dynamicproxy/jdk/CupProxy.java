package com.bhh.design.structural.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author bhh
 * @description 杯子代理类
 * @date Created in 2021-04-23 18:38
 * @modified By
 */
public class CupProxy implements InvocationHandler {

    // 需要进行代理的对象
    private ICup cup;
//    private Object obj;

//    public CupProxy(Object obj) {
//        this.obj = obj;
//    }
    public CupProxy(ICup cup) {
        this.cup = cup;
    }

    /**
     * 代理 处理器 (代理过程)
     * @param proxy
     * @param method 执行的方法
     * @param args   方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        beforeMethod();
        // 调用 实现方法
        method.invoke(cup, args);
        afterMethod();
        return null;
    }

    public Object executor(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                cup.getClass().getInterfaces(), this);
    }

    private void beforeMethod() {
        System.out.println("泡枸杞");
    }

    private void afterMethod() {
        System.out.println("身体好");
    }
}
