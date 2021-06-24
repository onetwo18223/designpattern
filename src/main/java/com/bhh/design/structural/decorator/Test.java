package com.bhh.design.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-21 16:35
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        IMikeTea mikeTea = new MikeTea();
        mikeTea = new WithCoconutDecoration(mikeTea);
        mikeTea = new WithCoconutDecoration(mikeTea);
        mikeTea = new WithPearlDecoration(mikeTea);
        mikeTea = new WithPearlDecoration(mikeTea);
        mikeTea.getMikeTea();
        System.out.println("总共 = " + mikeTea.cost());
    }
}
