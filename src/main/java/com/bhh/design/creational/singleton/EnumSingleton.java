package com.bhh.design.creational.singleton;

import lombok.extern.slf4j.Slf4j;
import sun.security.jca.GetInstance;

import java.io.Serializable;

/**
 * @author bhh
 * @description 枚举单例模式
 * @date Created in 2021-04-23 12:47
 * @modified By
 */
public enum  EnumSingleton {

    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("你好");
        }
    } ,INSTANCE2 {
        @Override
        protected void printTest() {

        }
    };


    /* INSTANCE 中写方法, 一定需要在外面进行声明为抽象,
     * 因为 Enum枚举的对象相当于是实现类对象
     * 而该 枚举对象就是抽象方法
     *
     * 枚举对象就是实现
     *
     * 若是只在 枚举的对象中写方法, 不在外声明为抽象方法, 调用时会报错
     */
    protected abstract void printTest();
    private Object obj;
    private int name;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static Object getInstance(){
        return INSTANCE;
    }

    /*
     * 枚举类如何防止序列化
     * ObjectInputStream#readObject0() 方法 -> readEnum() 方法
     * Enum<?> en = Enum.valueOf((Class)cl, name);
     * 根据enum的Class文件和 对象的名称来重新获取对象
     * 防止了反序列化对枚举单例模式的破坏
     */

    /*
     * 枚举类如何防止反射
     * 枚举类反编译后 会返现都继承于 Enum 类
     * 而这个类的 构造函数 (String, int)
     * 根据这俩个参数去反射 构造函数时, 会抛出 异常, "enum不可以被反射"
     */

}
