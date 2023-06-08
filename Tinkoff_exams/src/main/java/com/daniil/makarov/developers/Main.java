package com.daniil.makarov.developers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of juniors developers (n)");
        int n = scanner.nextInt();
        System.out.println("Enter number of seniors developers (m)");
        int m = scanner.nextInt();
        System.out.println("Enter number of developers (seniors) to check code (k)");
        int k = scanner.nextInt();
        int r = (n * k + m - 1) / m;
        System.out.println(r);
    }
}