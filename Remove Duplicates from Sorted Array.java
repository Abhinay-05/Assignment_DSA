class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int len = nums.length;
        for(int j = 0 ; j < len ; j++){
            int el = nums[i];
            if(el != nums[j]){
                nums[++i] = nums[j];
            }
        }
        return ++i;
    }
}
