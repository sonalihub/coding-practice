package com.codingpractice.leetcode;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        int arr1[]={1,4,5,6},arr2[]={5,6,7,8};
        int i=0,j=0,k=0;
        int n1=arr1.length, n2=arr2.length;
        int arr3[] = new int[n1+n2];

        //compare and add to new array
        while (i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        //copy if elements are left over in arr1
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
