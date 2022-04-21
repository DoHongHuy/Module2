package com.Clas;
// thuật toán xắp xếp nổi bọt:
// so sánh 2 phần tử liền kề nhau, nếu đứng chưa đúng thì đổi chổ
// so sánh thay đổi 2 phần tử liền kề nhau và lặp lui tới đén khi nào đến leng r dừng;
// link https://www.youtube.com/watch?v=nmhjrI-aW5o
public class BubbleSort {

    // Hàm sắp xếp nổi bọt
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // In các phần tử của arr
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 1, 4, 2, 8 };
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
// Nâng cao hơn
//public class bubbleSort {
//    static void bubbleSort(int arr[], int n) {
//        int i, j, temp;
//        boolean swapped;
//        for (i = 0; i < n - 1; i++) {
//            swapped = false;
//            for (j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // swap arr[j] và arr[j+1]
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//
//            // Nếu không có phần tử nào để hoán đổi
//            // bên trong vòng lặp thì Break
//            if (swapped == false)
//                break;
//        }
//    }
//
//    // In các phần tử của mảng
//    static void printArray(int arr[], int size) {
//        int i;
//        for (i = 0; i < size; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println();
//    }
//
//    public static void main(String args[]) {
//        int arr[] = { 5, 1, 4, 2, 8 };
//        int n = arr.length;
//        System.out.println("Mảng ban đầu:");
//        printArray(arr, n);
//        bubbleSort(arr, n);
//        System.out.println("Mảng sau khi sắp xếp:");
//        printArray(arr, n);
//    }
//}