package ru.itpark;

import java.util.Scanner;

public class remoteControl {
    public static void startTV (Scanner scanner) {
        showChannel tv = TV.getInstance();
        while (true) {
            System.out.println("Нажми на кнопку, получишь результат");
            System.out.println("-1. Выход");
            System.out.println("0-9. Каналы");
            int cmd = scanner.nextInt();
            switch (cmd) {
                case -1:
                    System.exit(0);
                    break;
                default:
                    tv.show(cmd);
            }
        }
    }
}
