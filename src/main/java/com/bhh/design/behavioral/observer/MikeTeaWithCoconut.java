package com.bhh.design.behavioral.observer;

import com.bhh.design.structural.decorator.IMikeTea;
import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description TODO
 * @date Created in 2021-04-22 13:33
 * @modified By
 */
@Slf4j
public class MikeTeaWithCoconut extends AMikeTea {
    private AMikeTea mikeTea;

    public MikeTeaWithCoconut(IFood food, AMikeTea mikeTea) {
        super(food);
        this.mikeTea = mikeTea;
    }

    @Override
    public void desc() {
        this.mikeTea.desc();
        System.out.print(" 加椰果");
    }

    @Override
    public int cost() {
        return this.mikeTea.cost() + 2;
    }
}
