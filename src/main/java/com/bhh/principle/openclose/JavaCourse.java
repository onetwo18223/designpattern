package com.bhh.principle.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description java课程类实现ICourse接口
 * @date Created in 2021-04-19 12:45
 * @modified By
 */
@Slf4j
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "javaCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
