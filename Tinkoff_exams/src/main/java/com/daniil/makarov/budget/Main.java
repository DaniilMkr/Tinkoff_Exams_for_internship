package com.daniil.makarov.budget;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers of days (n)");
        int num = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            System.out.println("Enter value of ai balance at i day");
            list.add(input.nextInt());
        }
        int n = list.size();
        HashSet<String> set = new HashSet<>();
        for (int x = 0; x < n - 1; x++) {
            for (int y = x + 2; y <= n; y++) {
                int sum = 0;
                for (int i = x; i < y; i++) {
                    sum += list.get(i);
                }
                if (sum == 0) {
                    for (int i = 0; i <= x; i++) {
                        for (int j = y - 1; j < n; j++) {
                            set.add(i + " " + j);
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(set.size());
    }
}
