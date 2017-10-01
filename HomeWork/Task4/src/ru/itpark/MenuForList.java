package ru.itpark;

import java.util.Scanner;

/**
 * Статический класс для работы с менюшкой списка
 */
public class MenuForList {
    public static int startMenuForList(Scanner scanner, ArrayList list) {
        while (true) {
            System.out.println("Меню для работы со списком:");
            System.out.println(" 1. Добавить в конец;");
            System.out.println(" 2. Добавить в начало;");
            System.out.println(" 3. Вставить;");
            System.out.println(" 4. Получить;");
            System.out.println(" 5. Заменить;");
            System.out.println(" 6. Отсортировать;");
            System.out.println(" 7. Реверсировать список;");
            System.out.println(" 8. Удалить;");
            System.out.println(" 9. Найти;");
            System.out.println("10. Вывести весь список;");
            System.out.println("11. Вернутся в меню для работы со списками.");
            int commandForList = scanner.nextInt();
            switch (commandForList) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    getListElement(scanner, list);
                    break;
                case 5:
                    replaceListElement(scanner, list);
                    break;
                case 6:
                    list.sort();
                    break;
                case 7:
                    list.reverse();
                    break;
                case 8:
                    System.out.println("Введите номер элемента, который хотели удалить:");
                    list.remove(scanner.nextInt());
                    break;
                case 9:
                    findListElement(scanner, list);
                    break;
                case 10:
                    System.out.println(list.toString());
                    break;
                case 11:
                    return 0;
                default:
                    System.err.println("Такой команды нет, попробуйте заново.");
                    break;
            }
        }
    }

    private static void getListElement(Scanner scanner, ArrayList list) {
        System.out.println("Введите позицию элемента, который Вам нужен:");
        int index = scanner.nextInt();
        if (index >= 0 && index < list.getCount()) {
            System.out.println(list.get(index));
        } else {
            System.err.println("Такого элемента нет.");
        }
    }

    private static void replaceListElement(Scanner scanner, ArrayList list) {
        System.out.println("Введите позицию и новый элемент через пробел:");
        int index = scanner.nextInt();
        int element = scanner.nextInt();
        list.replace(index, element);
    }

    private static void findListElement(Scanner scanner, ArrayList list) {
        System.out.println("Введите элемент, который хотели найти:");
        int element = scanner.nextInt();
        int index = list.find(element);
        if (index >= 0) {
            System.out.println("Ваш " + element + " находится на " + index +
                    " позиции.");
        } else {
            System.err.println("Такого элемента нет.");
        }
    }
}
