package com.bhh.design.structural.adapter.objectadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 对象适配器
 * @date Created in 2021-04-22 16:34
 * @modified By
 */
@Slf4j
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void doSomething() {
        adaptee.doShow();
    }
}
