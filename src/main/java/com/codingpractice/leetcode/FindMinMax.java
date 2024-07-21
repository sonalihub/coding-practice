package com.codingpractice.leetcode;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr={5,2,3,1,7,8};
        int n=arr.length;
        findMinMax(arr, n);
    }

    private static void findMinMax(int[] arr, int n) {
        //base
        int i, min, max;
        if(n%2==0)//even no of elements
        {
           if(arr[0]>arr[1])
           {
               max=arr[0];
               min=arr[1];
           }else {
               max=arr[1];
               min=arr[0];
           }
           i=2;
        }
        else{//odd no of elements
            max=arr[0];
            min=arr[0];
            i=1;
        }
        System.out.println("min:"+min+" max:"+max+" i:"+i);
        while(i<n-1){
            if(arr[i]>arr[i+1])
            {
                if(arr[i]>max) max=arr[i];
                if(arr[i+1]<min)  min=arr[i+1];
            }
            else{
                if(arr[i+1]>max) max=arr[i+1];
                if(arr[i]<min)  min=arr[i];
            }
            i+=2;
        }
        System.out.println("min:"+min+" max:"+max);
    }
}
