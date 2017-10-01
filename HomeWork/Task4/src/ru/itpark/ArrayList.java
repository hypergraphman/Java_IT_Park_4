package ru.itpark;

public class ArrayList {
    // константа - в коде уже изменить не получится
    private final int INITIAL_SIZE = 10;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;

    private void swap(int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    /**
     * Добавить элемент в конец
     * @param element
     */
    public void add(int element) {
        if (count < elements.length) {
            elements[count] = element;
            count++;
        } else {
            // TODO: увеличение размера массива
            System.err.println("Нет места");
        }
    }

    /**
     * Добавить элемент в начало списка, со сдвигом вправо
     * @param element
     */
    public void addToBegin(int element) {

    }

    /**
     * Вставить элемент в заданную позицию со сдвигом
     * @param element сам элемент
     * @param index индекс, куда надо вставить
     */
    public void insert(int element, int index) {

    }

    /**
     * Получить элемент по индексу
     * @param index
     * @return сам элемент по заданному индексу
     */
    public int get(int index) {
        if(index >= 0 && index < count) {
            return elements[index];
        }
        return -1;
    }

    /**
     * Заменить элемент в заданной позиции новым элементом
     * @param index
     * @param element
     */
    public void replace(int index, int element) {
        if (index >= 0 && index < count) {
            elements[index] = element;
        }
    }

    public void sort() {
        for (int i = count - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (elements[j] < elements[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void reverse() {
        for (int i = 0; i < count / 2; ++i) {
            swap(i, count - 1 - i);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; ++i) {
                elements[i] = elements[i + 1];
            }
            count--;
        }
    }

    /**
     * Вернуть индекс элемента, если элемента нет = -1
     * @param searchElement
     * @return
     */
    public int find(int searchElement) {
        for (int i = 0; i < count; ++i) {
            if (elements[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public String toString (){
        String temp = "";
        for (int element: elements) {
            temp += element + " ";
        }
        if (count == 0) {
            temp = "список пуст";
        }
        return temp;
    }
}