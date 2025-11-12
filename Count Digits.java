// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        return divideEven(n, n);
    }
    
    static int divideEven(int n, int num){
        if(n == 0){
            return 0;
        }
        
        int r = n % 10;
        if(r != 0 && num % r == 0){
            return 1 + divideEven(n/10, num);
        }
        
        return divideEven(n/10, num);
    }
}
