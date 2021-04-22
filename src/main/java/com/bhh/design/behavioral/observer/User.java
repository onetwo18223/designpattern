package com.bhh.design.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * @author bhh
 * @description 用户类
 * 用户类 监听 是否已经出菜
 * @date Created in 2021-04-22 12:47
 * @modified By
 */
@Slf4j
public class User implements Observer {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                '}';
    }

    /**
     *
     * @param o 被观察对象 这里指 FoodSetFinish
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(userName + "成功获取到所有食物!");
    }
}
