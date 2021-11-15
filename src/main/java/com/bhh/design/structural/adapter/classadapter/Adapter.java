package com.bhh.design.structural.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 目标 类
 * @date Created in 2021-04-22 16:28
 * @modified By
 */
@Slf4j
public class Adapter extends Adaptee implements Target {
    @Override
    public void doSomething() {
        super.doShow();
    }
}
