package com.bridgelabz;

public class LargestNumber {
    static void largestNumberInArray(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args){
        int[] arr1 = {8,1,3,4,9,5,6,2};
        largestNumberInArray(arr1);
    }
}
