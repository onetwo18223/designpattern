package com.bhh.design.behavioral.observer;

import com.bhh.design.creational.prototype.clone.A;
import com.bhh.design.structural.decorator.IMikeTea;
import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 添加珍珠
 * @date Created in 2021-04-22 13:31
 * @modified By
 */
public class MikeTeaWithPearl extends AMikeTea {
    private AMikeTea mikeTea;

    public MikeTeaWithPearl(IFood food, AMikeTea mikeTea) {
        super(food);
        this.mikeTea = mikeTea;
    }

    @Override
    public void desc() {
        this.mikeTea.desc();
        System.out.print(" 加珍珠");
    }

    @Override
    public int cost() {
        return this.mikeTea.cost() + 1;
    }
}
