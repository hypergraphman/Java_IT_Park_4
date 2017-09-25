package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome.\nStore MENU:");
        System.out.println("1. View store");
        System.out.println("2. Add first");
        System.out.println("3. Add last");
        System.out.println("4. Delete element");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        Store store = new Store();

        while (true) {
            System.out.println("Please, enter number command");
            int cmd = scanner.nextInt();
            int temp;
            switch (cmd) {
                case 1:
                    Messages.MessagesPrint(store.View(scanner));
                    break;
                case 2:
                    System.out.println("Please, enter number for add first element in store:");
                    temp = scanner.nextInt();
                    Messages.MessagesPrint(store.Push(0, temp));
                    break;
                case 3:
                    System.out.println("Please, enter number for add last element in store:");
                    temp = scanner.nextInt();
                    Messages.MessagesPrint(store.Push(store.getCount(), temp));
                    break;
                case 4:
                    System.out.println("Please, enter number position delete element in store:");
                    temp = scanner.nextInt();
                    Messages.MessagesPrint(store.Pop(temp - 1));
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This command not found");
            }
        }
    }
}
