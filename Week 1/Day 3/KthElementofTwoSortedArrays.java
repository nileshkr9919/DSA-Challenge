/*
Coding Platform: GeeksForGeeks
Link: https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1#
*/

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int[] sortedArray = new int[n + m];
        int i = 0, j = 0, d = 0;
        while (i < n && j < m)
        {
            if (arr1[i] < arr2[j])
                sortedArray[d++] = arr1[i++];
            else
                sortedArray[d++] = arr2[j++];
        }
        while (i < n)
            sortedArray[d++] = arr1[i++];
        while (j < m)
            sortedArray[d++] = arr2[j++];
        return sortedArray[k - 1];
    }
}