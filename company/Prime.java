package com.company;

import java.util.Scanner;

public class Prime {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Nhập n: ");
        number = scan.nextInt();
        System.out.print("Các số nguyên tố nhỏ hơn " + number + "là :");

        for(int i = 1;i < number;i++){
            int count = 0;
            for (int j=1; j<= number;j++){
                if(i%j ==0){
                    count ++;
                }
            }
            if(count ==2){
                System.out.print(" " + i + " -");
            }
        }
    }
}
