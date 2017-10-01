package ru.itpark;

import java.util.Scanner;

/**
 * Статический класс для работы с менюшкой списка
 */
public class MenuForList {
    public static int startMenuForList(Scanner scanner, ArrayList list) {
        while (true) {
            // 3. Работа со списком - попросить ввести номер спика
            //       1. Добавить
            //       2. Удалить
            //       3. ....
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
            System.out.println("11. Вернутся в меню для работы со списками;");
            int commandForList = scanner.nextInt();
            switch (commandForList) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    return 0;
                default:
                    System.out.println("Такой команды нет, попробуйте заново.");
                    break;
            }
        }
    }
}
