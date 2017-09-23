package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Math Menu:");
        System.out.println("1. To enter two numbers ");
        System.out.println("2. Output sum of numbers");
        System.out.println("3. Output subtract of numbers");
        System.out.println("4. Output multiply of numbers");
        System.out.println("5. Exit");
        System.out.println();

        boolean isTwoNumbers = false;
        int a = 0, b = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the command number you want to do:");
            try {
                int cmd = scanner.nextInt();
                if (cmd == 5){
                    System.out.println("Thank you for using our program. To come back again.");
                    System.exit(0);
                } else if (cmd == 1) {
                    System.out.println("To enter number A:");
                    a = scanner.nextInt();
                    System.out.println("To enter number B:");
                    b = scanner.nextInt();
                    isTwoNumbers = true;
                } else if (isTwoNumbers) {
                    switch (cmd){
                        case 2 :
                            System.out.println("A + B = " + (a + b));
                            break;
                        case 3 :
                            System.out.println("A - B = " + (a - b));
                            break;
                        case 4 :
                            System.out.println("A * B = " + (a * b));
                            break;
                        default:
                            System.out.println("This command does not exist!");
                    }
                } else {
                    System.out.println("First, you need to run the command 1");
                }
            }
            catch (Exception e) {
                System.out.println("Something went wrong");
                System.out.println(e.toString());
                System.exit(0);
            }

        }
    }
}
