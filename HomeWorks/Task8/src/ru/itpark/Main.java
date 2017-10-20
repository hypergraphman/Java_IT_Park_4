package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Parser p = Parser.builder()
                .add(new CountDigitsHandler())
                .add(new CountLettersHandler())
                .add(new CountSpacesHandler())
                .build();

        String words[] = p.parse(line);
        p.results();
    }
}
