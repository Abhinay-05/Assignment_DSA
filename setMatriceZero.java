/*
    73. Set Matrix Zeroes
*/
 

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] m = new boolean[matrix.length];
        boolean[] n = new boolean[matrix[0].length]; 

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j] == 0){
                    m[i] = true;
                    n[j] = true;
                }
            }
        }

        // set all rows as zero
        for(int i = 0 ; i < m.length ; i++){
            if(m[i]){
                for(int j = 0 ; j < n.length ; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        // set all columns as zero
        for(int j = 0 ; j < n.length ; j++){
            if(n[j]){
                for(int i = 0 ; i < m.length ; i++){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}