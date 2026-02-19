class bullsAndCows{
    // Single-pass
    // TC:O(n)
    // SC:O(1)
    public static String getHint(String secret, String guess) {
        int n = guess.length();
        int[] freq = new int[10];  
        int bull = 0, cow = 0;

        for(int i = 0; i < n; i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if(s==g){//number is at correct position
                bull++;
            }
            else{
                if(freq[s-'0'] < 0){
                    cow++;
                }
                if(freq[g-'0'] > 0){
                    cow++;
                }

                freq[s-'0']++;
                freq[g-'0']--;
            }
        }
        return bull+"A"+cow+"B";
    }
    public static void main(String[] args) {
        String secret = "1807";
        String guess = "7810";
        System.out.println(getHint(secret, guess));//1A3B

        secret = "1123";
        guess = "0111";
        System.out.println(getHint(secret, guess));//1A1B
    }
}