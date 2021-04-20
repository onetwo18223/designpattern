package com.bhh.design.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author bhh
 * @description 接口实现类
 * @date Created in 2021-04-20 14:19
 * @modified By
 */
@Slf4j
public class PythonNote implements INotes{

    @Override
    public void getNotes() {
        System.out.println("获取Python课程笔记");
    }
}
