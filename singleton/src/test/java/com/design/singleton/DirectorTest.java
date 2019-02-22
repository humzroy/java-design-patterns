package com.design.singleton;

/**
 * 测试普通单例模式
 */
public class DirectorTest extends SingletonTest<Director> {

    /**
     * 创建一个测试用例
     */
    public DirectorTest() {
        super(Director::getInstance);
    }
}
