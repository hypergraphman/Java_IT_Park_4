package ru.itpark;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int counter[] = new int[100];
        for (int i: counter) {
            i = 0;
        }
        try {
            FileInputStream input = new FileInputStream("input.txt");
            int currentByte = input.read();

            while (currentByte != -1) {
                if (currentByte == 32){
                    int d1 = input.read() - '0';
                    int d2 = input.read() - '0';
                    counter[d1*10 + d2]++;
                }
                currentByte = input.read();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        for(int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                System.out.println("Людей возраста " + i + " лет " + counter[i] + " штук");
            }
        }
    }
}
