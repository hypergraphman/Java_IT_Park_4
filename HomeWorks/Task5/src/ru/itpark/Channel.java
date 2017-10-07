package ru.itpark;

public class Channel {
    private Telecast[] telecasts;
    private int count;
    private final int MAX_CHANNELS = 10;
    private int limitChannels = 2;

    public Channel (Telecast[] telecasts) {
        this.telecasts = telecasts;
        count = telecasts.length;
        limitChannels = count;
        checkRange();
    }

    public Channel () {
        count = 0;
        telecasts = new Telecast[limitChannels];
    }

    private void checkRange(){
        if (limitChannels > MAX_CHANNELS) {
            throw new ArrayIndexOutOfBoundsException("Список канало слишком велик");
        }
    }

    private void checkCount() {
        if (count == limitChannels) {
            limitChannels += limitChannels >> 1;
            checkRange();
            Telecast tempChannels[] = new Telecast[limitChannels];
            for (int i = 0; i < telecasts.length; ) {
                tempChannels[i] = telecasts[i++];
            }
            telecasts = tempChannels;
        }
    }

    public void addChannel (Telecast channel) {
        checkCount();
        telecasts[count++] = channel;
    }

    public void deleteChannel (int channelIndex) {
        for (int i = count--; i > channelIndex; ) {
            telecasts[--i] = telecasts[i + 1];
        }
    }

    public void showChannel (int channelIndex) {
        System.out.println(telecasts[channelIndex].show());
    }
}
