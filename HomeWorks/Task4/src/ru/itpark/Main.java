package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int status = Menu.startMenu(scanner);
        System.exit(status);
    }
}