package one_introduction_to_java;

import java.util.Scanner;

public class moneyChange {
    public  static  void  main(String[] args){
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 2300;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
