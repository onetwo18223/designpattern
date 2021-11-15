package com.bhh.design.creational.singleton;

import java.lang.reflect.Field;

/**
 * @author bhh
 * @description 双重检查模式(推荐面试使用)
 * 好处：线程安全，效率较高
 * 问题：为什么要使用synchronized?
 *          为了保证线程安全
 *      为什么要使用双重检查？
 *          存在多个线程通过第一次检查，造成多次实例化对象的情况
 *      为什么不直接用synchronized修饰getInstance()方法？
 *          存在性能问题，每次只有一个线程可以获取实例
 *      为什么使用volatile修饰INSTACNE？
 *          1.保证可见性（并非主要作用，因为该程序中有syn锁保证了可见性）
 *          2.创建对象实例并不是具备原子性（三个步骤：
 *              生成空间创建空的对象，调用构造函数，赋值引用）
 *              所以需要排除重排序的可能
 * @date Created in 2021-03-08 18:51
 * @modified By
 */
public class DoubleCheck {
    private volatile static DoubleCheck INSTANCE;

    private DoubleCheck(){
    }

    public static DoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (new Object()) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        System.out.println(DoubleCheck.getInstance());

        Class<?> clazz =
                Class.forName("com.bhh.design.creational.singleton.DoubleCheck");
        Field instance1 = clazz.getDeclaredField("INSTANCE");
        DoubleCheck instance = (DoubleCheck) clazz.newInstance();
        instance1.set(instance, new DoubleCheck());
        System.out.println(instance);
    }

}
