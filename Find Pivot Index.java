class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i : nums){
            total += i;
        }

        int len = nums.length;
        int left = 0;
        for(int i = 0 ; i < len ; i++){
            if(left == total - left - nums[i]){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}

class Solution1 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int el : nums){
            total += el;
        }
        return pivotIndex(nums, 0, 0, total);
    }

    private int pivotIndex(int[] nums, int i, int left, int total){
        // no Index found
        if(i == nums.length){
            return -1;
        }
        // Index found
        if(left == (total - nums[i] - left)){
            return i;
        }
        // next index
        return pivotIndex(nums, i+1, left+nums[i], total);
    }
}
