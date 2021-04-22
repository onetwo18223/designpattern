package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * @author bhh
 * @description 食物套装类
 * 被监听对象
 * <p>
 * 这个类若是 食物套装类, 我们并不能对所有食物都进行套装的提前定义,
 * 所以可以使用 装饰者模式 来对 食物套装类进行循环的添加
 * @date Created in 2021-04-22 12:49
 * @modified By
 */
@Slf4j
public class FoodSet implements IFood {
    private User user;

    public FoodSet(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void desc() {
        System.out.println("点餐 : ");
    }

    @Override
    public int cost() {
        return 0;
    }
}
