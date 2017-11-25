package ru.itpark;

import java.util.Scanner;

public class Main {

    public static int array[];
    public static int result = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

	    int numbersCount = s.nextInt();

	    array = new int[numbersCount];

	    int sum = 0;
	    for(int i = 0; i < numbersCount; i++) {
	        array[i] = (int) (Math.random() * 1000);
	        sum += array[i];
        }

        System.out.println(sum);

	    int threadsCount = s.nextInt();

	    //int d = numbersCount / threadsCount;
        int i = 0;
        SumThread sumThreads[] = new SumThread[threadsCount];
	    for (i = 0; i < threadsCount - 1; i++) {
            // System.out.println(d * i + ".." + (d * (i + 1) - 1) );
            sumThreads[i] = new SumThread(threadsCount * i, threadsCount * (i + 1));
        }
        // System.out.println(d * i + ".." + (numbersCount - 1) );
        sumThreads[i] = new SumThread(threadsCount * i, numbersCount);

	    for (i = 0; i < threadsCount; i++) {
	        sumThreads[i].start();
        }

        for (i = 0; i < threadsCount; i++) {
            try {
                sumThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(result);
    }
}
