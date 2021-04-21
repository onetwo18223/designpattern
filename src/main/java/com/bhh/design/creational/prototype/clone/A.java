package com.bhh.design.creational.prototype.clone;

import com.bhh.design.creational.prototype.Mail;
import lombok.Data;

import java.util.Date;

/**
 * @author bhh
 * @description 实体类
 * @date Created in 2021-04-21 9:37
 * @modified By
 */
@Data
public class A implements Cloneable {
    private Date date;
    private Mail mail;
    private String msg;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        A a = (A) super.clone();

        // 深克隆
        a.date = (Date) a.date.clone();
        return a;
    }

    @Override
    public String toString() {
        return "A{" +
                "date=" + date +
                ", mail=" + mail +
                ", msg='" + msg + '\'' +
                '}' + super.toString();
    }
}
