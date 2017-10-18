package ru.itpark;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Telecast telecast1 = new Telecast("00:00", LocalTime.parse("00:00"), LocalTime.parse("03:00"));
        Telecast telecast2 = new Telecast("03:00", LocalTime.parse("03:00"), LocalTime.parse("06:00"));
        Telecast telecast3 = new Telecast("06:00", LocalTime.parse("06:00"), LocalTime.parse("09:00"));
        Telecast telecast4 = new Telecast("09:00", LocalTime.parse("09:00"), LocalTime.parse("12:00"));
        Telecast telecast5 = new Telecast("12:00", LocalTime.parse("12:00"), LocalTime.parse("15:00"));
        Telecast telecast6 = new Telecast("15:00", LocalTime.parse("15:00"), LocalTime.parse("18:00"));
        Telecast telecast7 = new Telecast("18:00", LocalTime.parse("18:00"), LocalTime.parse("21:00"));
        Telecast telecast8 = new Telecast("21:00", LocalTime.parse("21:00"), LocalTime.parse("23:59:59"));
        Telecast telecasts[] = {telecast1, telecast2, telecast3, telecast4, telecast6, telecast5, telecast7, telecast8};
        Channel channel1 = new Channel(telecasts);
        Channel channel2 = new Channel();
        Channel channels[] = {channel1, channel2};

        TV tv = TV.getInstance();
        tv.setChannels(channels);
        remoteControl.startTV(scanner);
    }
}
