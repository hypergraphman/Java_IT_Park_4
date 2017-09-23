package ru.itpark;
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        int a[] = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = (random.nextInt() % 100 + 100) % 100;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a[i] = 0;
            }
        }
        for (Integer x: a) {
            System.out.print(x + " ");
        }

        int t;
        for (int i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = t;
        }
        System.out.println();
        for (Integer x: a) {
            System.out.print(x + " ");
        }
    }
}
