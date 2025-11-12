class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int vote = 0;
        for(int el : nums){
            if(vote == 0){
                max = el;
            }

            if(el == max){
                vote++;
            }
            else{
                vote--;
            }
        }
        return max;
    }
}
