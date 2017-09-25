package ru.itpark;

import java.util.Scanner;

// класс хранилище
public class Store {
    private int count;
    private int store[];
    private final int maxSize = 3;

    Store () {
        count = 0;
        store = new int[maxSize];
    }

    // смещение элементов хранилища вправо с указанной позиции и на какое кол-во элементов
    private void offsetRight (int pos, int offsetCount) {
        for (int i = count - 1 + offsetCount; i > pos; --i) {
            store[i] = store[i - offsetCount];
        }
        count += offsetCount;
    }

    // смещение элементов хранилища влево с указанной позиции и на какое кол-во элементов
    private void offsetLeft (int pos, int offsetCount) {
        // не реализовано, из-за отсутствия необходимости
    }

    // добавляет элемент в хранилище,
    // возвращает 0 если все хорошо, иначе другие значения
    // возвращает 1 если хранилище переполнено
    int Push (int pos, int newNumber) {
        if (count == maxSize) return 1;
        offsetRight(pos, 1);
        store[pos] = newNumber;
        return 0;
    }

    // удаляет элемент из хранилища
    // возвращает 0 если все хорошо, иначе другие значения
    // возвращает 2 если хранилице не имеет элемента равного позиции pos
    int Pop (int pos) {
        if (pos >= count) return 2;
        for (int i = pos; i < count - 1; ) {
            store[i] = store[++i];
        }
        count--;
        return 0;
    }

    // показыват все элементы хранилища
    int View (Scanner scanner) {
        if (count == 0) return 3;
        for (int i = 0; i < count; ++i) {
            System.out.print(store[i] + " ");
        }
        System.out.println();
        return 0;
    }

    // возвращает длину хранилища
    int getCount () {
        return count;
    }
}
