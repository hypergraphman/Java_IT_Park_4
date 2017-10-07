package ru.itpark;

import static java.lang.Math.*;

public class Main {

    public static double f(double x) {
        return sin(x);
    }

    public static double integrate(double a, double b, int n) {
        // рассчитать ширину разбиения
        double h = (b - a) / (n);
        double sum = 0;
        for (double xi = a; xi <= b; xi += h) {
            sum += f(xi) * h;
        }
        return sum;
    }

    public static void swap (Integer a, Integer b) {
        Integer temp = new Integer(a);
        a = b;
        b = temp;
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("aaa");
        Integer x = new Integer(5);
        Integer y = new Integer(10);
        swap(x, y);
        System.out.println(x + " " + y);
    }
}
