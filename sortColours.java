import java.util.Arrays;

public class sortColours {
    static void sortColors(int[] nums) {
        // Dutch Flag Algorithm
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){// if < is used instead of <=, then it will miss some 
            if(nums[mid] == 0){
                // if nums[mid] == 0
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                // if nums[mid] == 2
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
            else{
                // if nums[mid] == 1
                mid++;
            }
        }
    }  

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
