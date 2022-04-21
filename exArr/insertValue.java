package com.exArr;

import java.util.Scanner;

public class insertValue {
    public static void main(String[] args) {
        int dayso[] = {10, 2, 3, 4, 5, 6, 9, 13, 6, 12};
        Scanner scanner = new Scanner(System.in);
        int socanxoa = scanner.nextInt();
        int vitricanxoa = timvitriPhantu(dayso, socanxoa);
        if (vitricanxoa == -1) {
            System.out.println("Phần tử không có ở trong mảng!");
        } else {
            dayso = xoamotphantu(dayso, vitricanxoa);
        }
        for (int i = 0; i < dayso.length; i++) {
            System.out.println(dayso[i] + " ");
        }
    }

    static int timvitriPhantu(int[] dayso, int phantu) {
        int vitri = -1;
        for (int i = 0; i < dayso.length; i++) {
            if (dayso[i] == phantu) {
                vitri = i;
            }
        }
        return vitri;
    }

    static int[] xoamotphantu(int[] dayso, int vitri) {
        int[] dayso1 = new int[dayso.length - 1];
        for (int i = 0; i < vitri; i++) {
            dayso1[i] = dayso[i];
        }
        for (int i = vitri + 1; i < dayso.length; i++) {
            dayso1[i - 1] = dayso[i];
        }
        return dayso1;
    }
}
