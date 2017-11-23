package ru.itpark;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SumThread extends Thread {
    private int start;
    private int end;
    public SumThread(int s, int e) {
        start = s;
        end = e;
    }

    private final static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            lock.lock();
            Main.result += Main.array[i];
            lock.unlock();
        }
    }
}
