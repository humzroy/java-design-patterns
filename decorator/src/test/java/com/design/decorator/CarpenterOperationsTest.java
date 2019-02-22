package com.design.decorator;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 测试木匠操作
 */
public class CarpenterOperationsTest {

    private InMemoryAppender appender;

    @Before
    public void setUp() throws Exception {
        appender = new InMemoryAppender(CarpenterOperation.class);
    }

    @After
    public void tearDown() throws Exception {
        appender.stop();
    }

    @Test
    public void testOperations() throws Exception {
        final Operation carpenter = new CarpenterOperation();

        carpenter.checkBefore();
        assertEquals(appender.getLastMessage(), "检查木材");

        carpenter.join();
        assertEquals(appender.getLastMessage(), "打造锤把");

        carpenter.chekcAfter();
        assertEquals(appender.getLastMessage(), "检查成品锤把");

        assertEquals(3, appender.getLogSize());
    }

    private class InMemoryAppender extends AppenderBase<ILoggingEvent> {

        private List<ILoggingEvent> log = new LinkedList<>();

        public InMemoryAppender(Class clazz) {
            ((Logger) LoggerFactory.getLogger(clazz)).addAppender(this);
            start();
        }

        @Override
        protected void append(ILoggingEvent eventObject) {
            log.add(eventObject);
        }

        public String getLastMessage() {
            return log.get(log.size() - 1).getMessage();
        }

        public int getLogSize() {
            return log.size();
        }
    }
}