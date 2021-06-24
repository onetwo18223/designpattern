package com.bhh.design.creational.singleton;

import java.io.Serializable;

/**
 * @author bhh
 * @description 饿汉式单例模式
 * 可以使用21到23行避免反射破坏
 * @date Created in 2021-04-23 8:46
 * @modified By
 */
public class LazySingleton implements Serializable {

    private final static LazySingleton LAZY_SINGLETON = new LazySingleton();
    private static final long serialVersionUID = -5178220995304214586L;

    static {
        System.out.println("类初始化");
    }

    LazySingleton() {
        if (LAZY_SINGLETON != null) {
            throw new RuntimeException("单例构造器不允许反射调用");
        }
    }

    public static LazySingleton getInstance() {
        return LAZY_SINGLETON;
    }
}
