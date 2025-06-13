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
//        Arrays.sort(a);
//        return a[0];
//        *********************************************
        int mini = Integer.MAX_VALUE;
        for (int num : a) {
            mini = Math.min(mini, num);
        }
        return mini;
    }
}
