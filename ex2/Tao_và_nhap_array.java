package com.hahaha;

import java.util.Scanner;

public class Tao_và_nhap_array {
    public static void main(String[] args) {
        int[] arr;
        int a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("NHập size phần tử: ");
            a = sc.nextInt();
            if(a > 10)
                System.out.print("Nhập quá nhìu rồi:  ");
        }while (a < 10);

    }
}