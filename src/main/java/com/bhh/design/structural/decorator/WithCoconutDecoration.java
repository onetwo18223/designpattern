package com.bhh.design.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description TODO
 * @date Created in 2021-04-21 16:34
 * @modified By
 */
@Slf4j
public class WithCoconutDecoration extends MikeTeaDecoration {
    public WithCoconutDecoration(IMikeTea mikeTea) {
        super(mikeTea);
    }

    @Override
    public void getMikeTea() {
        super.getMikeTea();
        System.out.print(" 加椰果一份");
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
