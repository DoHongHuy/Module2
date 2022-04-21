package com.exArr;

public class mergeArray2 {
    public static void main(String[] args) {
        int[] src1 = {28, 14, 35, 19};
        int[] src2 = {17, 40, 23};
        int[] dst = new int[src1.length + src2.length];
        for(int i =0;i < dst.length;i++)
            dst[i] = src1[i] ;
        System.out.print(dst[1]);
    }
}