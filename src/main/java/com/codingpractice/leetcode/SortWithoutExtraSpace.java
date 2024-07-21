package com.codingpractice.leetcode;

import java.util.Arrays;

public class SortWithoutExtraSpace {
    public static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {

        if (arr1[ind1] > arr2[ind2]) {
            System.out.println("arr1[ind1]" + arr1[ind1] + " " + "arr2[ind2]" + arr2[ind2]);
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
            System.out.println("arr1[ind1]" + arr1[ind1] + " " + "arr2[ind2]" + arr2[ind2]);
        }

    }

    public static void main(String[] args) {


        int arr1[] = {1, 3, 5, 7}, arr2[] = {5, 6, 7, 8, 9};
        int m = arr1.length, n = arr2.length;
        int len = m + n;
        int gap = (len / 2) + (len % 2);
        //pointers

        while (gap > 0) {
            int left = 0, right = left + gap;
            //boundary condition
            while (right < len) {
                //arr1 and arr2
                if (left < m && right >= m) {
                    swapIfGreater(arr1, arr2, left, right - m);
                }//arr2 and arr2
                else if (left >= m) {
                    swapIfGreater(arr2, arr2, left - m, right - m);
                }
                //arr1 and arr1
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++;
                right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }


}


