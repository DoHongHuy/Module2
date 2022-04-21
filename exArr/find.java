package com.exArr;

import java.util.Scanner;

public class find {
    public static void main(String[] args){
        String[] students = {"Huy","Thiện","Huy" ,"Vinh", "Phôn","Phúc"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên:");
        String input_name = sc.nextLine();
        boolean inExist = false;
        for(int i = 0; i < students.length;i++){
            if( students[i].equals(input_name) ){
                System.out.println("Vị trí tên bạn muốn kiếm :" + input_name + " là " + (i + 1));
                inExist = true;
                break;

            }
        }
        if (!inExist)
            System.out.println(("Tên " + input_name+ " Không có trong dánh sách"));
    }
}
