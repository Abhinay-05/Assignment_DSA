import java.util.*;
public class aggressiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        //using Binary Search approach
        // TC: O(NlogM)
        // N -> number of elements in the array
        // M -> [1, *max_element(stalls.begin(), stalls.end)]
        // SC: O(1)
        Arrays.sort(stalls);
        int len = stalls.length;
        int  low = 1;
        int high = stalls[len-1] - stalls[0];
        while(low <= high){
            int mid = (high - low)/2 + low;

            if(canPlaceCows(stalls, k, mid)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }

    private static boolean canPlaceCows(int[] stalls, int k, int diff){
        int cowCnt = 1, last = stalls[0], len = stalls.length;
        for(int i = 1 ; i < len ; i++){
            if((stalls[i] - last) >= diff){
                cowCnt++;
                last = stalls[i];
            }
            if(cowCnt == k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;
        System.out.println(aggressiveCows(stalls, k));//3

        stalls = new int[]{10, 1, 2, 7, 5};
        k = 3;
        System.out.println(aggressiveCows(stalls, k));//4

        stalls = new int[]{2, 12, 11, 3, 26, 7};
        k = 5;
        System.out.println(aggressiveCows(stalls, k));//1

        stalls = new int[]{0, 3, 4, 7, 10, 9};
        k = 4;
        System.out.println(aggressiveCows(stalls, k));//3

    }

    
}
