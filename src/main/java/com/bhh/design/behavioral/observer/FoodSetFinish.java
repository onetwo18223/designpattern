package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;

/**
 * @author bhh
 * @description 出菜, 通知用户
 * @date Created in 2021-04-22 14:33
 * @modified By
 */
@Slf4j
public class FoodSetFinish extends Observable implements IFood  {
    private IFood food;

    public FoodSetFinish(IFood food) {
        this.food = food;
    }

    public void finish(User user){
        System.out.println(user.getUserName() + "的菜做完了");
        // 改变 change 状态
        setChanged();
        // 通知观察者, 可以进行传参, update() 方法第二个参数可以进行接收
        notifyObservers();
    }

    @Override
    public void desc() {
        food.desc();
    }

    @Override
    public int cost() {
        return food.cost();
    }
}
