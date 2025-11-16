// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        // code here
        return sumArray(arr, arr.length - 1);
    }
    
    private int sumArray(int[] arr, int n){
        if(n == 0){
            return arr[0];
        }
        
        return arr[n] + sumArray(arr, n-1);
    }
}
