package com.design.decorator;

/**
 * 流水线上操作行为的接口
 */
public interface Operation {

    void checkBefore();

    void join();

    void chekcAfter();
}
