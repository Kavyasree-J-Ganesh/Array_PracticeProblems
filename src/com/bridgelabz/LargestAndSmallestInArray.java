package com.bridgelabz;

public class LargestAndSmallestInArray {
    static void findLaregestandSmallest(int[] arr){
        int largest = arr[0];
        int smallest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest) {
                largest = arr[i];
            }

            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element is " + largest);
        System.out.println("Smallest Element is " + smallest);
    }
    public static void main(String[] args) {
        int[] arr = {2,31,4,5,1,2,5,6};
        findLaregestandSmallest(arr);
    }
}
