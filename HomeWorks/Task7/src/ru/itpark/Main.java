package ru.itpark;

public class Main {

    public static void main(String[] args) {

        char c1 = 'B';
        char c2 = 'b';
        char c3 = 'Б';
        char c4 = 'б';
        char c5 = '5';
        char ca[] = {'1', '2', '3'};
        System.out.println("1. Буква");
        System.out.println(Program.isLetter(c1));
        System.out.println("2. Буква");
        System.out.println(Program.isLetter(c5));
        System.out.println("3. Цифра");
        System.out.println(Program.isDigit(c5));
        System.out.println("4. Большая буква");
        System.out.println(Program.isUpper(c3));
        System.out.println("5. Большая буква");
        System.out.println(Program.isUpper(c2));
        System.out.println("6. Маленькая буква");
        System.out.println(Program.isLower(c4));

        System.out.println("7. Перевод массива символов 1 2 3 в число");
        System.out.println(Program.parse(ca));
    }
}
