// Given an array arr[] and an integer k where k is smaller than the size of the array, the task is to find the kth smallest element in the given array. It is given that all array elements are distinct.

// Note:-  l and r denotes the starting and ending index of the array.

// Example 1:

// Input:
// n = 6
// arr[] = 7 10 4 3 20 15
// k = 3
// l=0 r=5

// Output : 
// 7

// Explanation :
// 3rd smallest element in the given 
// array is 7.
// Example 2:

// Input:
// n = 5
// arr[] = 7 10 4 20 15
// k = 4 
// l=0 r=4

// Output : 
// 15

// Explanation :
// 4th smallest element in the given 
// array is 15.

import java.util.*;

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k-1];
    } 
}