package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Parser p = new Parser();
        String words[] = p.parse(line);
        int k = 0;
    }
}
