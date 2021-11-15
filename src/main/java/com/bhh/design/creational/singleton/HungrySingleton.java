package com.bhh.design.creational.singleton;

import java.io.Serializable;

/**
 * @author bhh
 * @description 懒汉式单例模式
 * 无法避免反射破坏
 * @date Created in 2021-04-23 9:01
 * @modified By
 */
public class HungrySingleton implements Serializable {

    private static final long serialVersionUID = -3381634976258483967L;
    private static HungrySingleton hungrySingleton;

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        if (hungrySingleton == null) {
            hungrySingleton = new HungrySingleton();
        }
        return hungrySingleton;
    }

    public Object readResolve(){
        return hungrySingleton;
    }
}
