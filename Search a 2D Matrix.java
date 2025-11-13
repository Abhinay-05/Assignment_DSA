/*
74. Search a 2D Matrix

You are given an m x n integer matrix matrix with the following two properties:
->Each row is sorted in non-decreasing order.
->The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;//rows
        int m = matrix[0].length;//column
        int row = 0;
        int col = m - 1;
        while(row < n && col >= 0){
            int el = matrix[row][col];
            if(el == target){
                return true;
            }
            if(el > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
