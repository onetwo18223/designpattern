package com.bhh.design.structural.adapter.objectadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 被适配对象
 * @date Created in 2021-04-22 16:28
 * @modified By
 */
@Slf4j
public class Adaptee {
    public void doShow(){
        System.out.println("被适配");
    }
}
