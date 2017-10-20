package ru.itpark;

public class CountDigitsHandler extends Counter implements ParserObserver {
    public CountDigitsHandler() {
        super();
    }

    @Override
    public void handleChar(char c) {
        if (c >= '0' && c <= '9'){
            count++;
        }
    }

    @Override
    public void PrintCount() {
        System.out.print("Цифр: ");
        super.PrintCount();
    }
}
