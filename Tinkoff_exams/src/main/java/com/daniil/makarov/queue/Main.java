package com.daniil.makarov.queue;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int h1 = scanner.nextInt();
        System.out.println("Enter number");
        int h2 = scanner.nextInt();
        System.out.println("Enter number");
        int h3 = scanner.nextInt();
        System.out.println("Enter number");
        int h4 = scanner.nextInt();
        if ((h1 >= h2) && (h2 >= h3) && (h3 >= h4)) {
            System.out.println("YES");
        } else if ((h4 >= h3) && (h3 >= h2) && (h2 >= h1)) {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}