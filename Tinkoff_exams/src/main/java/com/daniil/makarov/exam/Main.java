package com.daniil.makarov.exam;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();

        int[] min = new int[n];
        int[] max = new int[n];

        for (int i = 0; i < n; i++) {
            min[i] = scanner.nextInt();
            max[i] = scanner.nextInt();
        }

        int l_ind = 0;
        int r_ind = s;
        int m_med = 0;

        while (l_ind < r_ind) {
            int midValue = (l_ind + r_ind) / 2;
            if (midValue % 2 == 0) {
                midValue = (l_ind + r_ind) / 2 ;
            }
            else {
                midValue =  (l_ind + r_ind - 2) / 2;
            }
            int[] ints = new int[s + 1];
            for (int i = 0; i < n; i++) {
                if (min[i] > midValue) {
                    continue;
                }
                ints[Math.min(max[i], midValue)]++;
            }

            int sum = 0;
            int med = 0;
            for (int i = s; i >= 0; i--) {
                sum += ints[i];
                if (sum > n / 2) {
                    med = i;
                    break;
                }
                if (sum == n / 2 && n % 2 == 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (ints[j] > 0) {
                            med += j;
                            break;
                        }
                    }
                    med /= 2;
                    break;
                }
            }

            if (med > m_med) {
                m_med = med;
            }

            if (sum > n / 2) {
                r_ind = midValue - 1;
            } else {
                l_ind = midValue + 1;
            }
        }

        System.out.println(m_med);
    }
}