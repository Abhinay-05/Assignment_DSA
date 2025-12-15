public class kokoEatingBanans {
    public static int minEatingSpeed(int[] piles, int h) {
        //Binary Search Approach
        //TC: O(N*log(M))
        //N -> number of elements in the array
        //M -> maximum element in the array
        
        //find max elements
        int max = Integer.MIN_VALUE;
        for(int el : piles){
            max = Math.max(el, max);
        }

        int s = 1, e = max;
        while(s < e){
            int m = s + (e - s)/2;
            int count = 0;

            for(int el : piles){
                //count the number hours it takes to eat a pile
                count = count + (el/m);
                if((el/m) == 0 /*if less than 0*/|| (el%m) != 0/*if there is a remainder */){
                    count++;
                }
            }
            
            if(count > h){
                //takes more hours
                s = m + 1;
            }
            else{
                //takes less than or equals
                e = m;
            }
        }
        return s;
    }
    

    public static void main(String[] args){
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));

        piles = new int[]{30,11,23,4,20};
        h = 5;
        System.out.println(minEatingSpeed(piles, h));

        piles = new int[]{30,11,23,4,20};
        h = 6;
        System.out.println(minEatingSpeed(piles, h));
    }
}
