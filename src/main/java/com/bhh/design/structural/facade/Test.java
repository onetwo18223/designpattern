package com.bhh.design.structural.facade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

/**
 * @author bhh
 * @description 应用层
 * @date Created in 2021-04-21 15:08
 * @modified By
 */
public class Test {
    public static void main(String[] args) {
        Gift gift = new Gift("机器人");
        String exchange = GiftExchangeService.exchange(gift);
        if(! StringUtils.isEmpty(exchange)){
            System.out.println("订单号" + exchange);
        }
    }
}
