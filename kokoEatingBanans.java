public class kokoEatingBanans {
    public static int minEatingSpeed(int[] piles, int h) {
        //use Binary Search algorithm
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
