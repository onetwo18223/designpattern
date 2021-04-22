package com.bhh.design.behavioral.observer;

/**
 * @author bhh
 * @description 冰激凌接口
 * @date Created in 2021-04-22 13:25
 * @modified By
 */
public abstract class AIceCream implements IFood{
    IFood iFood;

    public AIceCream(IFood iFood) {
        this.iFood = iFood;
    }

    @Override
    public void desc() {
        this.iFood.desc();
    }

    @Override
    public int cost() {
        return this.iFood.cost();
    }
}
