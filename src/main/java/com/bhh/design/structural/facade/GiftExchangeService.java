package com.bhh.design.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 外观类
 * @date Created in 2021-04-21 15:00
 * @modified By
 */
@Slf4j
public class GiftExchangeService {
    private static Delivery delivery = new Delivery();
    private static GiftIntegral giftIntegral = new GiftIntegral();
    private static GiftPay pay = new GiftPay();

    public static String exchange(Gift gift){
        if(giftIntegral.check(gift)){
            if(pay.pay(gift)){
                String orderNumber = delivery.getOrderNumber(gift);
                return orderNumber;
            }
        }
        return null;
    }
}
