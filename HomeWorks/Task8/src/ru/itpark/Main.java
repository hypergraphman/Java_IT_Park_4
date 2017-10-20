package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Parser p = new Parser();
        ParserObserver countDigitsHandler = new CountDigitsHandler();
        ParserObserver countLettersHandler = new CountLettersHandler();
        ParserObserver countSpacesHandler = new CountSpacesHandler();
        p.addObserver(countDigitsHandler);
        p.addObserver(countLettersHandler);
        p.addObserver(countSpacesHandler);

        String words[] = p.parse(line);
        p.results();
    }
}
