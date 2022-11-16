package com.bridgelabz;

public class SecondSmallest {
    static void secondSmallest(int[] arr){
        int smallest = 0;
        int secondSmallest = 0;
        if( arr[0] > arr[1]){
            smallest = arr[1];
            secondSmallest = arr[0];
        }else {
            smallest = arr[0];
            secondSmallest = arr[1];
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i] < smallest){
               secondSmallest = smallest;
               smallest = arr[i];
            } else if(arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,1,2,3,4,5,10};
        secondSmallest(arr);
    }
}
