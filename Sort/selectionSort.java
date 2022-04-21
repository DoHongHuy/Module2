// link: https://www.youtube.com/watch?v=xWBP4lzkoyM
// so sánh giá trị đầu tiên với các phần tử sau , nếu lớn hơn thì so sánh tiếp
// cho dến khi hết length;
// rồi đén tiếp phần tử 2 ,,,, và dến phần tử cuối cùng;
// so sanh i 1 với i 2 , i3... số nào nhỏ nhất gắn vào i 1;
// i2 tiếp tục như i 1, và tiếp tục câu lệnh vs i 2 tới


package com.Clas;

public class selectionSort {
    void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min]) min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        selectionSort ob = new selectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
