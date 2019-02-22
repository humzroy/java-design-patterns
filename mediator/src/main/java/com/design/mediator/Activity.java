package com.design.mediator;

/**
 * 活动
 */
public enum Activity {
    SHOOT("射击", "Shooting"), GUESS("猜灯谜", "Guess"), DESKTOP_GAME("桌游", "Desktop games"), SING("唱歌", "singing");

    private String name;
    private String description;

    Activity(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
