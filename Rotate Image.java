class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        reverse(matrix, m);
        transpose(matrix, m);
        
    }
    private void reverse(int[][] matrix, int m){
        for(int[] arr : matrix){
            int s = 0, e = m-1;
            while(s < e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
    }
    private void transpose(int[][] matrix, int m){
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m-i-1 ; j++){
                int temp = matrix[m-j-1][m-i-1] ;
                matrix[m-j-1][m-i-1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
