package com.codingpractice.leetcode;

public class MissingNumber {
    public static void main(String [] args){
        //find the missing number from the array
        int arr[]= {-1,0,2,3,5,1};
        //since missing , lets consider the length to be n+1
        int n= arr.length;
        int total = 1;
        for(int i=2;i<=n+1;i++){
            total=total+i;
            System.out.println("after adding i "+total);
            total-=arr[i-2];
            System.out.println("after subtracting arr[i-2] "+total);
        }
        System.out.println("final total "+total);


    }
}
