package com.bhh.design.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description Note
 * @date Created in 2021-04-20 14:18
 * @modified By
 */
@Slf4j
public class JavaNote implements INotes{

    @Override
    public void getNotes() {
        System.out.println("获取Java课程笔记");
    }
}
