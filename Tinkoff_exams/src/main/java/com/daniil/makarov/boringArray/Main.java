package com.daniil.makarov.boringArray;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter l number");
        int n = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter x numbers");
            arrayList.add(input.nextInt());
        }
        int answer = 1;
        HashMap<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arrayList.get(i);
            d.put(key, d.getOrDefault(key, 0) + 1);
            if (isBoring(new ArrayList<>(d.values()))) {
                answer = i + 1;
            }
        }
        System.out.println(answer);
    }
    public static boolean isBoring(ArrayList<Integer> list) {
        HashSet<Integer> s = new HashSet<>(list);
        if (s.size() == 2) {
            if (Collections.frequency(list, Collections.min(s)) == 1) {
                return true;
            }
            if (Collections.frequency(list, Collections.max(s)) == 1) {
                return true;
            }
        }
        return Collections.frequency(list, 1) == list.size();
    }
}