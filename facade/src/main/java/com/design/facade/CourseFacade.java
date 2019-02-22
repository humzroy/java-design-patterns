package com.design.facade;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程外观
 */
public class CourseFacade {

    private final List<CourseParticipator> participators;

    public CourseFacade() {
        participators = new ArrayList<>();
        participators.add(new CourseTeacher());
        participators.add(new CourseStudent());
    }

    public void prepare() {
        for (CourseParticipator participator :
                participators) {
            participator.action(CourseParticipator.Event.EVENT_GOTO_SCHOOL);
            participator.action(CourseParticipator.Event.EVENT_PREPARE);
        }
    }

    public void proceed() {
        for (CourseParticipator participator :
                participators) {
            participator.action(CourseParticipator.Event.EVENT_PROCEED);
        }
    }

    public void stop() {
        for (CourseParticipator participator :
                participators) {
            participator.action(CourseParticipator.Event.EVENT_STOP);
            participator.action(CourseParticipator.Event.EVENT_GO_HOME);
        }
    }
}
