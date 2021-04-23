package com.bhh.design.creational.singleton;

/**
 * @author bhh
 * @description 内部类单例模式
 * 线程安全原因 : 类初始的步骤是线程安全的
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

