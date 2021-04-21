package com.bhh.design.creational.prototype;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 邮件实体类
 * @date Created in 2021-04-21 9:05
 * @modified By
 */
@Slf4j
@Data
public class Mail implements Cloneable {
    @Override
    public String toString() {
        return "Mail{" +
                "mailName='" + mailName + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", mailContent='" + mailContent + '\'' +
                '}' + super.toString();
    }

    private String mailName;
    private String mailAddress;
    private String mailContent;

    Mail(MailBuilder builder) {
        log.info("Mail build");
        this.mailName = builder.mailName;
        this.mailAddress = builder.mailAddress;
        this.mailContent = builder.mailContent;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        log.info("mail 已经被复制");
        return super.clone();
    }

    public static class MailBuilder {
        private String mailName;
        private String mailAddress;
        private String mailContent;

        public MailBuilder buildMailName(String mailName) {
            this.mailName = mailName;
            return this;
        }

        public MailBuilder buildMailAddress(String mailAddress) {
            this.mailAddress = mailAddress;
            return this;
        }

        public MailBuilder buildMailContent(String mailContent) {
            this.mailContent = mailContent;
            return this;
        }

        public Mail build(){
            return new Mail(this);
        }
    }
}
