package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 冰激凌类
 * @date Created in 2021-04-22 13:20
 * @modified By
 */
@Slf4j
public class IceCreamFactory extends IIceCreamFactory {
    private static final int IceCreamValue = 4;
    private IFood food;

    public IceCreamFactory(IFood food) {
        this.food = food;
    }

    @Override
    public AIceCream getIceCream() {
        return new AIceCream(food) {
            @Override
            public void desc() {
                super.desc();
                System.out.print("一个冰激凌");
            }

            @Override
            public int cost() {
                return super.cost() + IceCreamValue;
            }
        };
    }
}
