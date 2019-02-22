package com.design.facade;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * 测试外观模式
 */
public class CourseFacadeTest {

    private InMemoryAppender appender;

    @Before
    public void setUp() throws Exception {
        appender = new InMemoryAppender();
    }

    @After
    public void tearDown() throws Exception {
        appender.stop();
    }

    @Test
    public void testWholeDayOfSchool() throws Exception {
        final CourseFacade facade = new CourseFacade();

        // 准备工作（学习）
        facade.prepare();
        assertTrue(appender.logContains("老师赶往学校"));
        assertTrue(appender.logContains("学生赶往学校"));
        assertTrue(appender.logContains("老师准备上课"));
        assertTrue(appender.logContains("学生准备上课"));

        assertEquals(appender.getLogSize(), 4);

        // 工作（学习）过程
        facade.proceed();
        assertTrue(appender.logContains("学生正在上课"));
        assertTrue(appender.logContains("学生正在上课"));
        assertEquals(appender.getLogSize(), 6);

        // 结束工作（学习）
        facade.stop();
        assertTrue(appender.logContains("学生下课"));
        assertTrue(appender.logContains("老师下课"));
        assertTrue(appender.logContains("老师回家"));
        assertTrue(appender.logContains("学生回家"));
        assertEquals(appender.getLogSize(), 10);
    }

    private class InMemoryAppender extends AppenderBase<ILoggingEvent> {

        private List<ILoggingEvent> log = new LinkedList<>();

        public InMemoryAppender() {
            ((Logger) LoggerFactory.getLogger("root")).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent eventObject) {
            log.add(eventObject);
        }

        public int getLogSize() {
            return log.size();
        }

        public boolean logContains(String message) {
            return log.stream().anyMatch(event -> event.getFormattedMessage().equals(message));
        }
    }
}