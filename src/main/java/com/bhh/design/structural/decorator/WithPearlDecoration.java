package com.bhh.design.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description TODO
 * @date Created in 2021-04-21 16:32
 * @modified By
 */
@Slf4j
public class WithPearlDecoration extends MikeTeaDecoration {
    public WithPearlDecoration(IMikeTea mikeTea) {
        super(mikeTea);
    }

    @Override
    public void getMikeTea() {
        super.getMikeTea();
        System.out.print(" 加珍珠一份");
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
