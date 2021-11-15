package com.bhh.design.structural.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 正常继承接口
 * @date Created in 2021-04-22 16:30
 * @modified By
 */
@Slf4j
public class NormalTarget implements Target{
    @Override
    public void doSomething() {
        System.out.println("正常实现");
    }
}
