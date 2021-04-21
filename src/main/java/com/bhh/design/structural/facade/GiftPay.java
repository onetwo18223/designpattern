package com.bhh.design.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 支付类
 * @date Created in 2021-04-21 14:55
 * @modified By
 */
@Slf4j
public class GiftPay {
    public boolean pay(Gift gift){
        log.info("购买" + gift.getGiftName() + "...付款成功");
        return true;
    }
}
