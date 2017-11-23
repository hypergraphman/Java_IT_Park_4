package ru.itpark;

public class SumThread1 extends Thread {
    private int start;
    private int end;
    public SumThread1(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            synchronized (Main.array) {
                Main.result += Main.array[i];
            }
        }
    }
}
