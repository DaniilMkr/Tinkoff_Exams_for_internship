package com.daniil.makarov.developers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int r = (n * k + m - 1) / m;
        System.out.println(r);
    }
}