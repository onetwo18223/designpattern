package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 蛋糕类
 * @date Created in 2021-04-22 15:06
 * @modified By
 */
@Slf4j
public abstract class ACake implements IFood{
    IFood food;

    public ACake(IFood food) {
        this.food = food;
    }

    @Override
    public void desc() {
        food.desc();
    }

    @Override
    public int cost() {
        return food.cost();
    }
}
