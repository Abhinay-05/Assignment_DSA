import java.util.*;

public class mergeSortedArrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i = 0, j = 0;
        int indx = 0;
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                ans[indx++] = nums1[i++];
            }
            else{
                ans[indx++] = nums2[j++];
            }
        }
        if(i < m){
            while(i < m){
                ans[indx++] = nums1[i++];
            }
        }
        else{
            while(j < n){
            ans[indx++] = nums2[j++]; 
        }
        }

        for(i = 0 ; i < m+n ; i++){
            nums1[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);  
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{1};
        nums2 = new int[]{};
        merge(nums1, 1, nums2, 0);  
        System.out.println(Arrays.toString(nums1));


        nums1 = new int[]{0};
        nums2 = new int[]{1};
        merge(nums1, 0, nums2, 1);  
        System.out.println(Arrays.toString(nums1));
    }
}
