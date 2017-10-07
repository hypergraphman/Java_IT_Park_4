package ru.itpark;

import java.util.Scanner;

/**
 * Статический класс для работы с менюшкой
 */
public class Menu {
    private static final int INITIAL_SIZE_LISTS = 5;
    private static ArrayList lists[];

    public static int startMenu(Scanner scanner) {
        lists = new ArrayList[INITIAL_SIZE_LISTS];
        // МЕНЮ
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать список;");
            System.out.println("2. Показать все списки;");
            System.out.println("3. Работать со списком;");
            System.out.println("4. Выход.");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    createList(scanner);
                    break;
                case 2:
                    viewAllArrayList();
                    break;
                case 3:
                    viewAllArrayList();
                    toWorkWithTheList(scanner);
                    break;
                case 4:
                    System.out.println("Пока-пока.");
                    return 0;
                default:
                    System.err.println("Такой команды нет, попробуйте заново.");
                    break;
            }
        }
    }

    private static void viewAllArrayList(){
        for (int i = 0; i < INITIAL_SIZE_LISTS; ++i) {
            if (lists[i] != null) {
                System.out.println(i + " - " + lists[i].toString());
            }
            else {
                System.out.println(i + " - список не создан.");
            }
        }
    }

    private  static void createList(Scanner scanner) {
        System.out.println("Введите номер создаваемого списка: [0.." +
                (INITIAL_SIZE_LISTS - 1)+ "].");
        int listNumber = scanner.nextInt();
        if (listNumber >= 0 && listNumber <= INITIAL_SIZE_LISTS) {
            lists[listNumber] = new ArrayList();
        } else {
            System.out.println("Вы не попали в диапазон, список не создан");
        }
    }

    public static void toWorkWithTheList(Scanner scanner) {
        System.out.println("Выберете список для работы:");
        int indexList = scanner.nextInt();
        if (lists[indexList] != null) {
            MenuForList.startMenuForList(scanner, lists[indexList]);
        } else {
            System.err.println("Этот список еще не создан");
        }
    }
}
