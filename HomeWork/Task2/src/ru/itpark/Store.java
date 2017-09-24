package ru.itpark;

import java.util.Scanner;

/**
 * Created by user on 24.09.2017.
 */
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

    // добавляет элемент в хранилище
    void Push (int pos, int newNumber) {

    }

    // удаляет элемент из хранилища
    void Pop (int pos) {

    }

    // показыват все элементы хранилища
    void View (Scanner scanner) {

    }

    // возвращает длину хранилища
    int getCount () {
        return count;
    }
}
