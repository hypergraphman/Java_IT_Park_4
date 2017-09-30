package ru.itpark;

import java.util.Scanner;

/**
 * Статический класс для работы с менюшкой
 */
public class Menu {
    private static final int INITIAL_SIZE_LISTS = 5;

    public static void startMenu(Scanner scanner) {
        // инзачально это массив null
        ArrayList lists[] = new ArrayList[INITIAL_SIZE_LISTS];
        // МЕНЮ
        // 1. Создать список (0..4) - создаете нужный список
        // 2. Показть все списки (показываются только ненулевые)
        // 3. Работа со списком - попросить ввести номер спика
        //       1. Добавить
        //       2. Удалить
        //       3. ....
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать список");
            System.out.println("2. Показать все списки");
            System.out.println("3. Работать со списком");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите номер создаваемого списка: [0.." +
                            (INITIAL_SIZE_LISTS - 1)+ "]");
                    int listNumber = scanner.nextInt();
                    lists[listNumber] = new ArrayList();
                    break;
                case 2:
                    for (int i = 0; i < INITIAL_SIZE_LISTS; ++i) {
                        if (lists[i] != null) {
                            System.out.println(lists[i].toString());
                        }
                        else {
                            System.out.println(i + " - список пуст");
                        }
                    }
                    break;
                case 3:
                    System.out.println("");
                    break;
            }
        }
    }
}
