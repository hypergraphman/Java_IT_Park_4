package ru.itpark;

public class TV {
    private Channel channels[];
    private int count;
    private final int MAX_CHANNELS = 10;
    private int limitChannels = 2;

    public TV (Channel[] channels) {
        this.channels = channels;
        count = channels.length;
        limitChannels = count;
        checkRange();
    }

    public TV () {
        count = 0;
        channels = new Channel[limitChannels];
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
            Channel tempChannels[] = new Channel[limitChannels];
            for (int i = 0; i < channels.length; ) {
                tempChannels[i] = channels[i++];
            }
            channels = tempChannels;
        }
    }

    public void addChannel (Channel channel) {
        checkCount();
        channels[count++] = channel;
    }

    public void deleteChannel (int channelIndex) {
        for (int i = count--; i > channelIndex; ) {
            channels[--i] = channels[i + 1];
        }
    }

    public void showChannel (int channelIndex) {
        System.out.println(channels[channelIndex].show());
    }
}
