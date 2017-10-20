package ru.itpark;

public class CountLettersHandler extends Counter implements ParserObserver {
    public CountLettersHandler() {
        super();
    }

    @Override
    public void handleChar(char c) {
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' ||
                c >= 'А' && c <= 'Я' || c >= 'а' && c <= 'я') {
            count++;
        }
    }

    @Override
    public void PrintCount() {
        System.out.print("Букв: ");
        super.PrintCount();
    }
}
