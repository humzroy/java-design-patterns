package com.design.singleton;

/**
 * 测试枚举类型单例模式
 */
public class EnumDirectorTest extends SingletonTest<EnumDirector> {

    /**
     * 创建一个测试用例
     */
    public EnumDirectorTest() {
        super(() -> EnumDirector.INSTANCE);
    }
}
