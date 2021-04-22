package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-22 13:47
 * @modified By
 */
@Slf4j
public class Test {

    private static final String CakeName = "wdnmd";
    private static final String CakeMaterial = "feces";

    public static void main(String[] args) {
        User bhh = new User("bhh");

        IFood food = new FoodSet(bhh);
        food = new IceCreamFactory(food).getIceCream();
        food = new MilkTea(food);

        food = new MikeTeaWithCoconut(food, (AMikeTea) food);
        food = new MikeTeaWithPearl(food, (AMikeTea) food);
        food = new MilkTea(food);
        food = new MikeTeaWithCoconut(food, (AMikeTea) food);
        food = new Cake.CakeBuilder().buildContent(CakeName).buildMaterial(CakeMaterial).build(food);
        food = new FoodSetFinish(food);
        food.desc();
        System.out.println("\n总共 = " + food.cost());
        FoodSetFinish finish = (FoodSetFinish) food;

        // 添加 观察者
        finish.addObserver(bhh);

        finish.finish(bhh);
    }
}
