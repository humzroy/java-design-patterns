package com.design.composite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * 测试语句生成器
 */
public class WriterTest {

    private ByteArrayOutputStream stdOutBuffer;

    private final PrintStream realStdOut = System.out;

    @Before
    public void setUp() throws Exception {
        this.stdOutBuffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(stdOutBuffer));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(realStdOut);
    }

    @Test
    public void sentenceByChinese() throws Exception {
        final Writer writer = new Writer();
        testWriterCn(writer.sentenceByChinese(), "我是来自北京的小明。");
    }

    @Test
    public void sentenceByEnglish() throws Exception {
        final Writer writer = new Writer();
        testWriter(writer.sentenceByEnglish(), "I am a student from London.");
    }

    /**
     * 测试输出是否和预期相等
     *
     * @param givenComposite 输入的组件
     * @param expectedString 期望值
     */
    private void testWriter(final CharacterComposite givenComposite, final String expectedString) {
        final String[] words = expectedString.trim().split(" ");
        assertNotNull(givenComposite);
        assertEquals(givenComposite.count(), words.length);

        givenComposite.print();

        assertEquals(expectedString, new String(this.stdOutBuffer.toByteArray()).trim());
    }

    /**
     * 测试输出是否和预期相等_中文
     *
     * @param givenComposite 输入的组件
     * @param expectedString 期望值
     */
    private void testWriterCn(final CharacterComposite givenComposite, final String expectedString) {
        assertNotNull(givenComposite);

        givenComposite.print();

        assertEquals(expectedString, new String(this.stdOutBuffer.toByteArray()).trim());
    }
}