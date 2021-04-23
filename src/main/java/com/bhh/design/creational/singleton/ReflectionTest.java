package com.bhh.design.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-23 8:50
 * @modified By
 */
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException, NoSuchFieldException {
        Class<LazySingleton> clazz =
                (Class<LazySingleton>) Class.forName("com.bhh.design.creational.singleton.LazySingleton");
        Constructor<LazySingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        // 反射会造成类的初始化
//        LazySingleton lazySingleton = constructor.newInstance();

        /*
         * 除了 枚举类单例模式
         * 在类初始化时进行赋值的单例模式可以避免反射
         * 其他的模式 都无法避免反射
         */

        /*
         * private static final 也可以通过反射获取
         */
        Field singleton = clazz.getDeclaredField("LAZY_SINGLETON");
        singleton.setAccessible(true);
        System.out.println("Field = " + singleton.get(LazySingleton.getInstance()));
    }
}
