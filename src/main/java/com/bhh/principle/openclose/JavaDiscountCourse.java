package com.bhh.principle.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 对javaCourse进行继承, 目的是为了实现打折
 *
 * 在符合开闭原则的条件下, 对程序进行扩展
 * @date Created in 2021-04-19 16:35
 * @modified By
 */
@Slf4j
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginalPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public String toString() {
        return "javaCourse{" +
                "id=" + super.getId() +
                ", name='" + super.getName() +
                ", discountPrice=" + getPrice() +
                ", originalPrice=" + getOriginalPrice() +
                '}';
    }
}
