package com.bhh.design.creational.prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-21 9:07
 * @modified By
 */
@Slf4j
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail.MailBuilder().buildMailContent("我是邮件模板").build();
        System.out.println("mail.hashCode() = " + mail.hashCode());
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            System.out.println("mailTemp.hashCode() = " + mailTemp.hashCode());
            mailTemp.setMailName("bhh" + i);
            mailTemp.setMailAddress("bhh" + i + "@foxmail.com");
            mailTemp.setMailContent("你好, 今天是星期" + i);
            MailUtil.sendMail(mailTemp);

        }
        MailUtil.saveOriginContent(mail);
    }
}
