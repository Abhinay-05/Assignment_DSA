import java.util.Arrays;

public class sortColours {
    static void sortColors(int[] nums) {
        int[] count = new int[3];

        for(int el : nums){
            count[el]++;
        }

        count[1] += count[0];
        count[2] += count[1];

        int i = 0;
        while(i < count[0]){
            nums[i] = 0;
            i++;
        }
        while(i < count[1]){
            nums[i] = 1;
            i++;
        }
        while(i < count[2]){
            nums[i] = 2;
            i++;
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
