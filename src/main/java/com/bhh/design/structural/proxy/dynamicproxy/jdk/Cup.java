package com.bhh.design.structural.proxy.dynamicproxy.jdk;

/**
 * @author bhh
 * @description 杯子类
 * @date Created in 2021-04-23 18:36
 * @modified By
 */
public class Cup implements ICup{

    @Override
    public void drink(){
        System.out.println("喝水");
    }

    @Override
    public void buy() {
        System.out.println("买杯子");
    }
}
