class Solution {
    public int towerOfHanoi(int n, int from, int aux, int to) {
        // code here
        if(n == 1){
            System.out.println(from + "->" + to);
            return 1;
        }
        
        int ans = towerOfHanoi(n-1, from, to, aux) + 1;
        System.out.println(from + "->" + to);
        ans += towerOfHanoi(n-1, aux, from, to);
        return ans;
    }
}
