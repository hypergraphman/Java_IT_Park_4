package ru.itpark;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T>{
    private T elements[];
    private int count;

    public ArrayList() {
        this.elements = (T[]) new Object[100];
        this.count = 0;
    }

    public void add(T element) {
        this.elements[count++] = element;
    }

    public T get(int index) {
        return elements[index];
    }

    public void set(int index, T t) {
        elements[index] = t;
        if (count < index) count = index;
    }

    public void swap(int i, int j) {
        T temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {

        private int currentElement;

        private ArrayListIterator() {
            currentElement = 0;
            for (int i = 0; i < count; i++) {
                if (elements[i] != null) {
                    currentElement = i;
                    break;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return elements[currentElement] != null;
        }

        @Override
        public T next() {
            T value = elements[currentElement];
            currentElement++;
            return value;
        }
    }
}
