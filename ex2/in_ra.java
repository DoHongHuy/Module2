package com.hahaha;

import java.util.Scanner;
public class in_ra {
    public static void main(String[] args){
        int nhap;
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhập phần tử: ");
        nhap = sc.nextInt();
        if(nhap <= 0){
            System.out.print("Nhập sai rồi");
        }else
            System.out.print("Đây là số nguyên dương");


}
}