package com.bhh.design.structural.adapter.objectadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description TODO
 * @date Created in 2021-04-22 16:17
 * @modified By
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.doSomething();
    }
}
