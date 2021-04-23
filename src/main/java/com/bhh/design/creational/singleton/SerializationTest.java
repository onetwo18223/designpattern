package com.bhh.design.creational.singleton;

import java.io.*;

/**
 * @author bhh
 * @description 序列化测试
 * @date Created in 2021-04-23 8:59
 * @modified By
 */
public class SerializationTest implements Serializable {

    private static final long serialVersionUID = -7277600448522470080L;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        HungrySingleton instance = HungrySingleton.getInstance();
        EnumSingleton instance = (EnumSingleton) EnumSingleton.getInstance();
        instance.setName(3);
        instance.setObj("bhh");
        instance.printTest();


        File file = new File("filetest");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        out.writeObject(instance);

        /* 关键步骤 : 读取对象时, 是如何读取的?
         * readObject()->readObject0()->switch case 对读取类型进行判断 对应Object的方法 readOrdinaryObject
         * -> 三目运算符(若是可以序列化就反射创建对象) ->
         * 检查是否有 readResolve()方法, 若是有则将使用readResolve() 返回的对象覆盖反射创建的对象
         * 最终返回一个obj
         */
//        HungrySingleton newInstance = (HungrySingleton)in.readObject();
        EnumSingleton newInstance = (EnumSingleton)in.readObject();

        /*
         * 序列化破坏 :
         * instance = com.bhh.design.creational.singleton.HungrySingleton@14514713
         * newInstance = com.bhh.design.creational.singleton.HungrySingleton@69663380
         *
         * 如何防止序列化破坏?
         * 类中添加 Object readResolve()方法, 返回实例化对象
         */
        System.out.println("instance = " + instance);
        System.out.println("newInstance = " + newInstance);
        System.out.println(instance == newInstance);

        /*
         * 测试 : 防止反射还可以继续使用反序列, 为什么?
         * 反序列化的实质不是通过反射来实例化对象吗?
         * 反射就会调用构造函数?
         * 为什么?
         *
         * 反序列化会调用构造函数, 但是调用的构造函数都是序列化类的父类, 也就是Object类
         * 是通过Object的构造函数 来 获取 需要反序列化的对象
         *
         * 反序列不会调用序列化类的构造函数
         */
    }
}
