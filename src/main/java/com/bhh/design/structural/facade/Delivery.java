package com.bhh.design.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 物流
 * @date Created in 2021-04-21 14:58
 * @modified By
 */
@Slf4j
public class Delivery {
    public String getOrderNumber(Gift gift){
        log.info(gift.getGiftName() + "已成功出库");
        return "666";
    }
}
