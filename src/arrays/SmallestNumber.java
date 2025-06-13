package arrays;

import java.util.Arrays;

//Problem Statement: Given an array, we have to find the smallest element in the array.
//arr[] = {8,10,5,7,9};
public class SmallestNumber {
    public static void main(String[] args) {
       int[] arr = {8,10,5,7,9};
       System.out.println(smallNum(arr));
    }
    public static int smallNum(int[] a){
        Arrays.sort(a);
        return a[0];
    }
}
