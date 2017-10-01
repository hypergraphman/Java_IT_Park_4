package ru.itpark;

public class ArrayList {
    private final int INITIAL_SIZE = 4;
    private final int MAX_SIZE = Integer.MAX_VALUE >> 1;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;

    private void swap(int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    private boolean increaseInSize() {
        int newSize = elements.length + (elements.length >> 1);
        if (newSize <= MAX_SIZE) {
            int newArray[] = new int[newSize];
            for (int i = 0; i < count; ++i) {
                newArray[i] = elements[i];
            }
            elements = newArray;
        } else {
            // TODO: Надо вызвать исключение, что массив достиг предела
            // пока реализовал с помощью булеан
            System.err.println("Нет места");
            return false;
        }
        return true;
    }

    private void decreaseInSize() {
        // пока решил не реализовывать, т.к. не было в ДЗ
        // будет использоваться при удалении элементов в массиве
        // задача - занимать меньше памяти если список стал меньше
    }

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    /**
     * Добавить элемент в конец
     * @param element
     */
    public void add(int element) {
        insert(count, element);
    }

    /**
     * Добавить элемент в начало списка, со сдвигом вправо
     * @param element
     */
    public void addToBegin(int element) {
        insert(0, element);
    }

    /**
     * Вставить элемент в заданную позицию со сдвигом
     * @param index индекс, куда надо вставить
     * @param element сам элемент
     */
    public void insert(int index, int element) {
        // сделать лучше тут исключениями в будущем, как тему пройдем
        // но это не точно
        if (index >= 0 && index <= count) {
            boolean isNotFull = true;
            if (count == elements.length) {
                isNotFull = increaseInSize();
            }
            if (isNotFull) {
                for (int i = count++; i > index; ) {
                    elements[i] = elements[--i];
                }
                elements[index] = element;
            }
        } else {
            System.err.println("Нет такого элемента");
        }
    }

    /**
     * Получить элемент по индексу
     * @param index
     * @return сам элемент по заданному индексу
     */
    public int get(int index) {
        return elements[index];
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
                if (elements[j] > elements[j + 1]) {
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
        // TODO: заглушка, нерабочий метод decreaseInSize
        decreaseInSize();
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
        if (count == 0) {
            return "список пуст";
        }
        String tempString = "[";
        for (int i = 0; i < count - 1; ++i) {
            tempString += elements[i] + ", ";
        }
        tempString += elements[count - 1] + "]";
        return tempString;
    }
}