package com.bridgelabz;

public class SmallestNumber {
    static void largestNumberInArray(int[] arr){
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
    public static void main(String[] args){
        int[] arr1 = {5,4,3,2,8,9,6};
        largestNumberInArray(arr1);
    }
}
