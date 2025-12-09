public class trappingTheRainWater {
    // TC: O(2N) -> 2 for loops
    // SC: O(2N) -> 2 array to store max element of both sides
    static int trap(int[] height) {
        int l = 0, r = 0;//stack to store current largest element
        int len = height.length;
        //arrays to store max element on each side
        int[] left = new int[len];//max element on left
        int[] right = new int[len];//max element on right

        for(int i = 0 ; i < len ; i++){
            left[i] = l;//update left max of current element
            right[len-i-1] = r;//update right max of current element

            l = Math.max(l, height[i]);// current left max
            r = Math.max(r, height[len-i-1]);// current right max
        }

        int ans = 0;//calculate final answer
        for(int i = 0 ; i < len ; i++){
            int diff = Math.min(left[i], right[i]) - height[i];
            if(diff > 0){//if diff < 0 then it will not store any water
                ans += diff;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

        height = new int[]{4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
