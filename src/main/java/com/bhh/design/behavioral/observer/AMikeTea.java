package com.bhh.design.behavioral.observer;

/**
 * @author bhh
 * @description 奶茶 装饰抽象类
 * @date Created in 2021-04-22 13:23
 * @modified By
 */
public abstract class AMikeTea implements IFood {
    protected IFood food;

    public AMikeTea(IFood food) {
        this.food = food;
    }

    @Override
    public void desc(){
        food.desc();
    }

    @Override
    public int cost(){
        return this.food.cost();
    }
}
