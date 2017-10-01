package ru.itpark;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[2] = new int[]{1, 2, 3};
        System.out.println(a[2] != null);

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(-1);
        al.get(1);
        int temp = 4;
        temp = temp << 28;
        System.out.println(temp - ((Integer.MAX_VALUE >> 1) + 1));
    }
}
