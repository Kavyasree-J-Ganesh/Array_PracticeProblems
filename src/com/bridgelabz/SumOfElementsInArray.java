package com.bridgelabz;

public class SumOfElementsInArray {
    static int sumOfElements(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
       int[] arr1 = {1,8,4,3,9,6};
        int sum = sumOfElements(arr1);
       System.out.println(sum);
    }
}
