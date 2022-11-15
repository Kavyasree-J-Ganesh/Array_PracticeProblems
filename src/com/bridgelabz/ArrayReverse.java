package com.bridgelabz;

public class ArrayReverse {
    static void reverseElements(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] p = {9,8,7,6,5,4,3,2,1};
        reverseElements(p);
    }
}
