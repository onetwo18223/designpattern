package com.bhh.design.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description IVideo 接口实现类
 * @date Created in 2021-04-20 14:23
 * @modified By
 */
@Slf4j
public class JavaVideo implements IVideo{

    @Override
    public void getVideo() {
        System.out.println("获取Java课程视频");
    }
}
