public class containerWithMaxWater {
    public static int maxArea(int[] height) {
        int ans = 0;
        int st = 0, end = height.length-1;

        while(st < end){
            int len = Math.min(height[st], height[end]);
            int breadth = end - st;
            int area = len * breadth;
            if(ans < area){
                ans = area;
            }
            if(height[st] <= height[end]){
                st++;
            }
            else{
                end--;
            }
        }   
        return ans;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

        height = new int[]{1,1};
        System.out.println(maxArea(height));
    }
}
