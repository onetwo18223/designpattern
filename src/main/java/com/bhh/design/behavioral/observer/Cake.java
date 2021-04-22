package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 蛋糕 and 蛋糕制造器
 * @date Created in 2021-04-22 15:09
 * @modified By
 */
@Slf4j
public class Cake extends ACake {
    private String material;
    private String content;

    public Cake(IFood food) {
        super(food);
    }

    public Cake(IFood food, CakeBuilder builder) {
        super(food);
        this.material = builder.material;
        this.content = builder.content;
    }

    public Cake(IFood food, String material, String content) {
        super(food);
        this.material = material;
        this.content = content;
    }

    @Override
    public void desc() {
        food.desc();
        System.out.println(" 加一个" + material + "做的蛋糕(上面写着 : " + content + ")");
    }

    @Override
    public int cost() {
        return food.cost() +50;
    }

    public static class CakeBuilder {
        private String material;
        private String content;

        public CakeBuilder buildMaterial(String material) {
            this.material = material;
            return this;
        }

        public CakeBuilder buildContent(String content) {
            this.content = content;
            return this;
        }

        public Cake build(IFood food) {
            return new Cake(food, this);
        }
    }
}
