/**
 * @file: 快速排序
 * @author: michael
 * @date: 2020/3/24 16:12
 * @copyright: 南京凯盛
 */
package com.cc.algo.sort;

/**
 * @author michael
 * @version 1.0 Created on 2020/3/24 16:12
 */
public class 快速排序 {
    // test
    public static int[] qsort(int arr[], int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            for (int index : arr) {
                System.out.print(index + "\t");
            }
            System.out.println("==");
        }



        if (i - 1 > start) arr = qsort(arr, start, i - 1);
        if (j + 1 < end) arr = qsort(arr, j + 1, end);
        return (arr);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{12, 20, 5, 16, 15, 1, 30, 45};
        int len = arr.length - 1;
        arr = qsort(arr, 0, len);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
