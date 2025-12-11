public class rotatedSortedArray {
    public static int search(int[] nums, int target) {
        //using Binary Search approach
        int s = 0, e = nums.length - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(nums[m] == target){
                return m;
            }
            if(nums[s] <= nums[m]){
                //if first part is sorted
                if(nums[s] <= target && target < nums[m]){
                    //target lies in first part
                    e = m - 1;
                }
                else{
                    //target lies in second half
                    s = m + 1;
                }
            }
            else{
                //second part is sorted
                if(nums[m] < target && target <= nums[e]){
                    //lies in second half
                    e = m + 1;
                }
                else{
                    // lies in first half 
                    s = m - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));

        target = 3;
        System.out.println(search(nums, target));
    }
    
}
