package com.bhh.design.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description IVideo 接口实现类
 * @date Created in 2021-04-20 14:24
 * @modified By
 */
@Slf4j
public class PythonVideo implements IVideo{
    @Override
    public void getVideo() {
        System.out.println("获取Python课程视频");
    }
}
