import java.util.HashSet;

public class longestConsecutiveSequence {
    // TC:O(N)
    // SC:O(N)
    public static int longestConsecutive(int[] nums) {
        int ans = 0;
        if(nums.length == 0){
            return ans;
        }
        // store elements in unsorted set
        HashSet<Integer> set = new HashSet<>();
        for(int el : nums){
            set.add(el);
        }
        // traverse through the set
        for(Integer el : set){
            // if (currentEl-1) doesn't exist then try to find all the currentEL's successors
            if(!set.contains(el-1)){
                int count = 0;
                while(set.contains(el)){
                    count++;
                    el++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));//4

        nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));//9

        nums = new int[]{1,0,1,2};
        System.out.println(longestConsecutive(nums));//3
    }
}
