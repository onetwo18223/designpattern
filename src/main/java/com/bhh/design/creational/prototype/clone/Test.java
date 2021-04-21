package com.bhh.design.creational.prototype.clone;

import com.bhh.design.creational.prototype.Mail;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-21 9:39
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        A a = new A();
        a.setDate(date);
        a.setMsg("msg = a");

        A b = (A) a.clone();

        System.out.println("a.hashCode() = " + a.hashCode());
        System.out.println("b.hashCode() = " + b.hashCode());
        System.out.println(a);
        System.out.println(b);

//        a.setDate(new Date(123456L));
        a.getDate().setTime(1234567L);
        a.setMail(new Mail.MailBuilder().buildMailContent("meiyou").build());
        System.out.println(a);
        System.out.println(b);
    }
}
