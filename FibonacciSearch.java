public class FibonacciSearch {
    public static void main(String[] args) {
        int[] nums = {-15, -5, 2, 5, 7, 10, 28, 30, 45, 56};
        int target = 45;
        System.out.println(fibonacciSearch(nums, target));
    }

    private static int fibonacciSearch(int[] nums, int target){
        int offset = -1;
        int n = nums.length ;

        int Fibm1 = 1;
        int Fibm2 = 0;
        int Fib = Fibm1 + Fibm2;

        while(Fib < n){
            Fibm2 = Fibm1;
            Fibm1 = Fib;
            Fib = Fibm1 + Fibm2;
        }

        int indx;
        while(Fib > 1){
            indx = Math.min(offset + Fibm2, n-1);

            if(nums[indx] == target){
                return indx;
            }

            if(nums[indx] < target){
                offset = indx;
                Fib = Fibm1;
                Fibm1 = Fibm2;
                Fibm2 = Fib - Fibm1;
            }
            else{
                Fib = Fibm2;
                Fibm1 = Fibm1 - Fibm2;
                Fibm2 = Fib - Fibm1;
            }
        }

//        check last element
        if(nums[offset+1] == target && Fibm1 != 0){
            return offset;
        }

        return -1;
    }
}
