class Solution {
    public int reverseExponentiation(int n) {
        // code here
        return power(n, reverse(n));
    }
    // find exponent
    private int power(int n, int rev){
        if(rev == 1){
            return n;
        }
        
        return n * power(n, rev-1);
    }
    // find reverse of a number
    private int reverse(int n){
        int x = 0;
        while(n != 0){
            int r = n % 10;
            x = x*10 + r;
            n /= 10;
        }
        return x;
    }
}
