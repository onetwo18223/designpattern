package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 奶茶类
 * @date Created in 2021-04-22 13:19
 * @modified By
 */
@Slf4j
public class MilkTea extends AMikeTea {

    private static final int MikeTeaValue = 8;

    public MilkTea(IFood food) {
        super(food);
    }

    @Override
    public void desc() {
        food.desc();
        System.out.print(" 一杯奶茶");
    }

    @Override
    public int cost() {
        return food.cost() + MikeTeaValue;
    }
}
