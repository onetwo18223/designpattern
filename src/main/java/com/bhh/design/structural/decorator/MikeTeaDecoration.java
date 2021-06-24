package com.bhh.design.structural.decorator;

/**
 * @author bhh
 * @description 抽象装饰类
 * @date Created in 2021-04-21 16:29
 * @modified By
 */
public class MikeTeaDecoration implements IMikeTea{

    private IMikeTea mikeTea;

    public MikeTeaDecoration(IMikeTea mikeTea) {
        this.mikeTea = mikeTea;
    }

    @Override
    public void getMikeTea() {
        this.mikeTea.getMikeTea();
    }

    @Override
    public int cost() {
        return this.mikeTea.cost();
    }
}
