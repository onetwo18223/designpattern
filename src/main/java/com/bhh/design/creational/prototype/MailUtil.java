package com.bhh.design.creational.prototype;

/**
 * @author bhh
 * @description 发送邮件 + 保存邮件模型
 * @date Created in 2021-04-21 9:15
 * @modified By
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        System.out.println("发送邮件成功" + mail);
    }

    public static void saveOriginContent(Mail mail) {
        System.out.println("保存模板: " + mail.getMailContent());
    }
}
