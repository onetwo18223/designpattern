package com.bhh.design.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 奶茶实体类
 * @date Created in 2021-04-21 16:25
 * @modified By
 */
@Slf4j
public class MikeTea implements IMikeTea {
    @Override
    public void getMikeTea(){
        System.out.print("一杯奶茶");
    }

    @Override
    public int cost(){
        return 8;
    }
}
