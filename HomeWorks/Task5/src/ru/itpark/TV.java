package ru.itpark;

public class TV implements showChannel {
    private Channel channels[];
    private int count;
    private final int MAX_CHANNELS = 10;
    private int limitChannels = 2;

    // пробуем реализовать Singleton
    private  static TV instance;

    private TV() {
        count = 0;
        channels = new Channel[limitChannels];
    }

    static  {
        instance = new TV();
    }

    public static TV getInstance() {
        return instance;
    }

    /*
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
    */
    private void checkRange(){
        if (limitChannels > MAX_CHANNELS) {
            throw new ArrayIndexOutOfBoundsException("Список каналов слишком большой");
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

    public void setChannels(Channel[] channels) {
        limitChannels = channels.length;
        // тут ставиться try catch, а в finally записывается исходны limitChannels
        checkRange();
        this.channels = channels;
        count = channels.length;
    }

    public void show (int channelIndex) {
        if (channelIndex >= 0 && channelIndex < count) {
            System.out.println(channels[channelIndex].showTelecast());
        } else if (channelIndex >= count && channelIndex < MAX_CHANNELS) {
            System.out.println("Канал не задан");
        } else {
            System.out.println("Такого канала не может быть");
        }
    }
}
