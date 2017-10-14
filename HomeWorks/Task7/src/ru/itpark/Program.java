package ru.itpark;

public class Program {
    public static boolean isLetter(char c) {
        if (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= 'А' && c <= 'Я' ||
                c >= 'а' && c <= 'я' || c == 'Ё' || c == 'ё') {
            return true;
        }
        return false;
    }

    public static boolean isDigit(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public static boolean isUpper(char c) {
        if (c >= 'A' && c <= 'Z' ||
                c >= 'А' && c <= 'Я' ||
                c == 'Ё') {
            return true;
        }
        return false;
    }

    public static boolean isLower(char c) {
        if (c >= 'a' && c <= 'z' ||
                c >= 'а' && c <= 'я' || c == 'ё') {
            return true;
        }
        return false;
    }

    public static int parse(char number[]) {
        int digit = 0;
        for (char c: number) {
            digit = digit * 10 + c - '0';
        }
        return digit;
    }
}
