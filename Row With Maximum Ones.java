class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int row = 0;
        int m = mat.length;
        int n = mat[0].length;

        for(int i = 0 ; i < m ; i++){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                int el = mat[i][j];
                if(el == 1){
                    count++;
                }
            }
            if(count == n){
                return new int[]{i, n};
            }
            if(count > max){
                max = count;
                row = i;
            }
        }
        return new int[]{row, max};
    }
}
