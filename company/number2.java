package com.company;
public class number2 {
    public static  boolean checkPrime(int number){
        if(number<2){
            return false;
        }
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println();
        int[] arr = {23, 29, 2, 1, 56, 54, 64, 75,11, 57, 3};
        for(int i=0;i<arr.length;i++){
            if(checkPrime(arr[i])==true){
                System.out.println(arr[i] + " la so nguyen to");
            }
        }


    }
}







//        System.out.println(checkPrime(1));
//        System.out.println(checkPrime(2));
//        System.out.println(checkPrime(13));
//        System.out.println(checkPrime(78));
//        System.out.println(checkPrime(6));
