package ru.itpark;

public class CountSpacesHandler extends Counter implements ParserObserver {
    public CountSpacesHandler() {
        super();
    }

    @Override
    public void handleChar(char c) {
        if (c == ' ' || c == '\t') {
            count++;
        }
    }

    @Override
    public void PrintCount() {
        System.out.print("Пробелов: ");
        super.PrintCount();
    }

}
