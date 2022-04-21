package com.exArr;

import java.util.Scanner;

public class chen_phan_tu_vao_mang {
    private static int index;

    public static void main(String[] args) {
        nhap();
    }

    static void nhap() {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào sso phâng tử ở mảng a[]");
        n = scanner.nextInt();
        a = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhập phần tử a[" + i + "]");
            a[i] = scanner.nextInt();
        }
        int x;
        System.out.print("Nhập vào phần tử cần chen, x = ");
        x = scanner.nextInt();
        chen(a, x);

    }

    public static void chen(int[] a, int x) {
        if (a[0] > x) {
            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
                a[0] = x;
            }
        } else if (a[a.length - 2] < x) {
            a[a.length - 1] = x;
        } else {
            int index = 0;
            for (int i = 0; i < a.length - 1; i++)
                if (a[i] > x) {
                    index = i;
                    break;
                }
            for (int i = a.length - 1; i > index; i--)
                a[i] = a[i - 1];
                a[index] = x;
        }
        display(a);
    }
    static void display(int[] a) {
        System.out.print("Mảng a[]: ");
        for (int x : a) {
            System.out.print(x + " ");
            System.out.print(" ");
        }
    }
}