package arrays;

import java.util.Arrays;

//Problem Statement: Given an array, we have to find the largest element in the array.
//int[] arr = {8,10,5,7,9};
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};
        System.out.println(largestNum(arr));
    }
    public static int largestNum(int[] a){
//        Arrays.sort(a);
//        return a[a.length-1];
//        **********************************************
        int maxi = a[0];
        for(int num : a){
            if(num > maxi){
                maxi = num;
            }
        }
        return maxi;
    }
}
