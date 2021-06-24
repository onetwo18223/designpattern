package com.bhh.design.creational.singleton;

/**
 * @author bhh
 * @description 内部类单例模式
 * 线程安全原因 : 类初始的步骤是线程安全的
 * 静态内部类的加载不需要依附外部类，在使用时才加载。( 程序 )
 * 不过在加载静态内部类的过程中也会加载外部类
 * ClassLoader类中的 loadClass()方法中 有 synchronized修饰代码块
 * @date Created in 2021-04-23 9:04
 * @modified By
 */
public class InnerStaticSingleton {
    public static class InnerStatic{
        private static InnerStaticSingleton singleton = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance(){
        return InnerStatic.singleton;
    }
}

