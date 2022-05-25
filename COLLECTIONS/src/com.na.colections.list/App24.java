package com.na.colections.list;
import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListIntegers = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        int number;

        System.out.println("nhap so phan tu cua arr: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            number = scanner.nextInt();
            arrListIntegers.add(number);
            
        }
        scanner.close();
        int max = arrListIntegers.get(0);

        for (int i = 1; i < arrListIntegers.size();i++) {
            if (arrListIntegers.get(i).compareTo(max) > 0) {
                max = arrListIntegers.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arr = " + max);
    }
}
