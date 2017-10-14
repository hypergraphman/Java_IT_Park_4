package ru.itpark;

import java.time.LocalTime;

public class Channel {
    private Telecast[] telecasts;
    private int count;
    private final int MAX_TELECAST = 10;
    private int limitTelecasts = 2;

    public Channel (Telecast[] telecasts) {
        this.telecasts = telecasts;
        count = telecasts.length;
        limitTelecasts = count;
        checkRange();
    }

    public Channel () {
        count = 0;
        telecasts = new Telecast[limitTelecasts];
    }

    private void checkRange(){
        if (limitTelecasts > MAX_TELECAST) {
            throw new ArrayIndexOutOfBoundsException("Список телепередач слишком большой");
        }
    }

    private void checkCount() {
        if (count == limitTelecasts) {
            limitTelecasts += limitTelecasts >> 1;
            checkRange();
            Telecast tempTelecasts[] = new Telecast[limitTelecasts];
            for (int i = 0; i < telecasts.length; ) {
                tempTelecasts[i] = telecasts[i++];
            }
            telecasts = tempTelecasts;
        }
    }

    public void addTelecast(Telecast telecast) {
        checkCount();
        // канал должен при добавлении контролировать время передач
        // TODO: надо реализовать
        telecasts[count++] = telecast;
    }

    public void deleteTelecast(int telecastIndex) {
        for (int i = count--; i > telecastIndex; ) {
            telecasts[--i] = telecasts[i + 1];
        }
    }

    public String showTelecast () {
        LocalTime currentTime = LocalTime.now();
        if (count != 0) {
            for (Telecast telecast : telecasts) {
                if (currentTime.isAfter(telecast.getBeginTime()) &&
                        currentTime.isBefore(telecast.getEndTime())) {
                    return "сейчас идет " + telecast.getName();
                }
            }
        }
        return "Профилактика, клевое изображение с разными цветами";
    }
}
