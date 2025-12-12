class Solution {
    public boolean search(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        int[] peak = findPeak(nums, 0, end);

        boolean ans = BS(nums, 0, peak[0], target);
        if(ans){
            return ans;
        }
        return BS(nums, peak[1]+1, end, target);
    }

    private int[] findPeak(int[] nums, int st, int end) {
        if (st > end) return new int[] {-1,-1};

        int mid = st + (end - st) / 2;
        int left = mid, right = mid;
        int len = nums.length;

        //left bound
        while ((left - 1) >= 0 && nums[left - 1] == nums[mid]) {
            left--;
        }

//        right bound
        while ((right + 1) < len && nums[right + 1] == nums[right]) {
            right++;
        }

        if ((left - 1) < 0 || nums[left - 1] < nums[mid]) {
//            greater than left
//            if((right+1) >= len && nums[0] < nums[mid] || nums[right+1] < nums[mid]){
            if (nums[(right + 1) % len] < nums[mid]){
//                greater than right
                return new int[]{mid, right};
        }
    }

        int[] x = findPeak(nums, st, mid-1);
        if(x[0] != -1){
            return x;
        }
        return findPeak(nums, mid+1, end);
    }

    private boolean BS(int[] nums, int st , int end, int target){
        if(st > end)return false;

        int mid = st + (end - st)/2;

        if(nums[mid] == target){
            return true;
        }

        if(target < nums[mid]){
            return BS(nums, st, mid-1, target);
        }
        return BS(nums, mid+1, end, target);
    }    

}
