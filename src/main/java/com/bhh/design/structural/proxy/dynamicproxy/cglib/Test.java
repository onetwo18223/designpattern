package com.bhh.design.structural.proxy.dynamicproxy.cglib;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-23 19:05
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Ipad ipad = new Ipad();
        IpadProxy proxy = new IpadProxy(ipad);
        Ipad newIpad = (Ipad)proxy.executor();
        newIpad.study();
    }
}
