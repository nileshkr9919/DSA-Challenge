/*
Coding Platform: Geeksforgeeks
Link to the problem: https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1#
*/

class GFG
{
    public static long first(long arr[], int low, int high, int x, int n)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid - 1), x, n);
        }
        return -1;
    }
 
    public static long last(long arr[], int low, int high, int x, int n)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x)
                return mid;
            else if (x < arr[mid])
                return last(arr, low, (mid - 1), x, n);
            else
                return last(arr, (mid + 1), high, x, n);
        }
        return -1;
    }
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> duplicates = new ArrayList<>();
        duplicates.add(first(arr, 0, n - 1, x, n));
        duplicates.add(last(arr, 0, n - 1, x, n));
        return duplicates;
    }
}