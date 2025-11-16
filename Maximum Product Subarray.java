class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int product1 = 1;
        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        
        int len = nums.length;
        // checking from front and behind at the same time
        for(int i = 0 ; i < len ; i++){
            product *= nums[i];
            product1 *= nums[len-i-1];

            if(product > max){
                max = product;
            }
            if(product1 > max1){
                max1 = product1;
            }

            if(product == 0){
                product = 1;
            }
            if(product1 == 0){
                product1 = 1;
            }
        }
        return Math.max(max, max1);
    }
}
