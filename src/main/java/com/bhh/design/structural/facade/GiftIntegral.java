package com.bhh.design.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 积分校验类
 * @date Created in 2021-04-21 14:50
 * @modified By
 */
@Slf4j
public class GiftIntegral {
    public boolean check(Gift gift){
        log.info("对" + gift.getGiftName() + "进行积分检验, 检验通过");
        return true;
    }
}
