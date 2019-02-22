package com.design.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 课堂参与者抽象类
 */
public abstract class CourseParticipator {

    private static final Logger LOGGER = LoggerFactory.getLogger(CourseParticipator.class);

    public void prepareCourse() {
        LOGGER.info("{}准备上课", name());
    }

    public void proceedCourse() {
        LOGGER.info("{}正在上课", name());
    }

    public void stopCourse() {
        LOGGER.info("{}下课", name());
    }

    public void goToSchool() {
        LOGGER.info("{}赶往学校", name());
    }

    public void goHome() {
        LOGGER.info("{}回家", name());
    }

    public abstract String name();

    public void action(Event... events) {
        for (Event e : events) {
            action(e);
        }
    }

    private void action(Event e) {
        switch (e) {
            case EVENT_PREPARE: {
                prepareCourse();
                break;
            }
            case EVENT_PROCEED: {
                proceedCourse();
                break;
            }
            case EVENT_STOP: {
                stopCourse();
                break;
            }
            case EVENT_GO_HOME: {
                goHome();
                break;
            }
            case EVENT_GOTO_SCHOOL: {
                goToSchool();
                break;
            }
            default: {
                LOGGER.info("未知操作");
                break;
            }
        }
    }

    static enum Event {
        EVENT_GOTO_SCHOOL, EVENT_PREPARE, EVENT_PROCEED, EVENT_STOP, EVENT_GO_HOME;
    }
}
