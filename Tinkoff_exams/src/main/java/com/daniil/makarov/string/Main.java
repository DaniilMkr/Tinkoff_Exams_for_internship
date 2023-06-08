package com.daniil.makarov.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of string");
        int lengthOfString = input.nextInt();
        System.out.println("Enter chars of string");
        String input_s = input.next();
        String s = "abcd";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            Character charAt = s.charAt(i);
            int count = map.getOrDefault(charAt, 0);
            map.put(charAt, count + 1);
        }
        int size = map.size();
        int l_ind = 0;
        int r_ind = 0;
        int l_ans = -1;
        int r_ans = -1;
        while (r_ind <= lengthOfString) {
            if (size > 0) {
                if (r_ind == lengthOfString)
                    break;
                r_ind++;
                Character charAt = input_s.charAt(r_ind - 1);
                if (map.containsKey(charAt)) {
                    int count = map.get(charAt);
                    if (count == 1)
                        size--;
                    map.put(charAt, count - 1);
                }
            } else {
                int w = r_ind - l_ind;
                int a = r_ans - l_ans;
                if (l_ans == -1 || w < a) {
                    l_ans = l_ind;
                    r_ans = r_ind;
                }
                l_ind++;
                Character c = input_s.charAt(l_ind - 1);
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    if (count == 0)
                        size++;
                    map.put(c, count + 1);
                }
            }
        }
        if (l_ans == -1)
            System.out.println("-1");
        else
            System.out.println(input_s.substring(l_ans, r_ans).length());
    }
}