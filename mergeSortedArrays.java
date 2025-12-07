import java.util.*;

public class mergeSortedArrays {
    //TC: O(N)
    //SC: O(1)
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        // start from back
        int i = m-1;//first array
        int j = n-1;//second array
        int indx = nums1.length-1;//element placement counter
        while( i != (-1) && j != (-1)){
            if(nums2[j] >= nums1[i]){//if second array has larger or equal element 
                nums1[indx--] = nums2[j--];
            }
            else{//if first array has smaller element
                nums1[indx--] = nums1[i--];
            }
        }

        while(j != (-1)){//if the second array still has some elements left
            nums1[indx--] = nums2[j--];
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
