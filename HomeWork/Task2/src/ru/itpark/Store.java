package ru.itpark;

import java.util.Scanner;

// класс хранилище
public class Store {
    private int count;
    private int store[];

    Store () {
        count = 0;
        store = new int[100];
    }

    // смещение элементов хранилища вправо с указанной позиции и на какое кол-во элементов
    private void offset (int pos, int offsetCount) {

    }

    // добавляет элемент в хранилище,
    // возвращает 0 если все хорошо, иначе другие значения
    // возвращает 1 если хранилище переполнено
    int Push (int pos, int newNumber) {

        return 0;
    }

    // удаляет элемент из хранилища
    // возвращает 0 если все хорошо, иначе другие значения
    // возвращает 2 если хранилице не имеет элемента равного позиции pos
    int Pop (int pos) {

        return 0;
    }

    // показыват все элементы хранилища
    void View (Scanner scanner) {

    }

    // возвращает длину хранилища
    int getCount () {
        return count;
    }
}
