package ru.itpark;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Telecast telecast1 = new Telecast("08:00", LocalTime.parse("08:00"), LocalTime.parse("11:00"));
        Telecast telecast2 = new Telecast("11:00", LocalTime.parse("11:00"), LocalTime.parse("14:00"));
        Telecast telecast3 = new Telecast("14:00", LocalTime.parse("14:00"), LocalTime.parse("17:00"));
        Telecast telecast4 = new Telecast("17:00", LocalTime.parse("17:00"), LocalTime.parse("20:00"));
        Telecast telecast5 = new Telecast("20:00", LocalTime.parse("20:00"), LocalTime.parse("23:00"));
        Telecast telecast6 = new Telecast("23:00", LocalTime.parse("23:00"), LocalTime.parse("02:00"));
        Telecast telecast7 = new Telecast("02:00", LocalTime.parse("02:00"), LocalTime.parse("05:00"));
        Telecast telecast8 = new Telecast("05:00", LocalTime.parse("05:00"), LocalTime.parse("08:00"));
        Telecast telecasts[] = {telecast1, telecast2, telecast3, telecast4, telecast6, telecast5, telecast7, telecast8};
        Channel channel1 = new Channel(telecasts);
        Channel channel2 = new Channel();
        Channel channels[] = {channel1, channel2};

        TV tv = new TV(channels);
        remoteControl.startTV(tv, scanner);
    }
}
