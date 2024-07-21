package com.codingpractice.leetcode;

import java.util.Arrays;

public class Sort012Array {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2};
        sortUsingCounters(arr, arr.length);
        sortUsingDutchNationalFlagAlg(arr, arr.length);
    }

    private static void sortUsingDutchNationalFlagAlg(int[] a, int n) {
        //0 to low-1=>0
        //low to mid-1=>1
        //mid to high=> unsorted array
        //high+1 to n-1 => 2
        int low=0, mid=0, high=n-1;
        while(mid<=high){
            //3 cases
            //if a of mid is 0
            if(a[mid]==0){
                swap(a,mid,low);
                low++;mid++;
            }
            //when a of mid is 1
            else if (a[mid]==1) {
                mid++;
            }
            //when a of mid is 2
            else{
                swap(a,mid,high);
                high--;
            }
        }
        System.out.println("DutchNationalFlagAlg "+Arrays.toString(a));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
      arr[j]=temp;
    }

    private static void
    sortUsingCounters(int[] arr, int n) {
        int count0=0, count1=0, count2=0;
        for(int i=0; i<n-1;i++)
        {
            if(arr[i]==0)count0++;
            else if (arr[i]==1) count1++;
           else count2++;

        }
        for(int i=0;i<count0;i++)arr[i]=0;
        for(int i=count0;i<count0+count1;i++)arr[i]=1;
        for(int i=count0+count1;i<n;i++)arr[i]=2;
        System.out.println(Arrays.toString(arr));

        //complexity => t.c = O(N)+O(N) = O(2N)
        //s.c =O(1)
    }


}
