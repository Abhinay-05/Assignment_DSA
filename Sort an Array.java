class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    private void mergeSort(int[] nums, int st, int end){
        if(st == end){
            return;
        }

        int mid = st + (end-st)/2;
        mergeSort(nums, st, mid);
        mergeSort(nums, mid+1, end);
        merge(nums, st, mid, end);
    }

    private void merge(int[] nums, int st, int mid, int end){
        int low = st;
        int high = mid+1;

        List<Integer> list = new ArrayList<>();
        while(low <= mid && high <= end){
            int left = nums[low];
            int right = nums[high];
            if(left <= right){
                list.add(left);
                low++;
            }
            else{
                list.add(right);
                high++;
            }
        }

        for(int i = low ; i <= mid ; i++){
            list.add(nums[i]);
        }
        for(int i = high ; i <= end ; i++){
            list.add(nums[i]);
        }

        for(int i = st ; i <= end ; i++){
            nums[i] = list.removeFirst();
        }
    }
}
