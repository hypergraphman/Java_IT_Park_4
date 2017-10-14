package ru.itpark;

import java.time.LocalTime;

public class Telecast {
    private String name;
    private LocalTime beginTime;
    private LocalTime endTime;

    public Telecast (String name, LocalTime beginTime, LocalTime endTime) {
        this.name = name;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
