/*
242. Valid Anagram
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int len = s.length();
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0 ; i < len ; i++){
            count[s.charAt(i) - 97]++;
            count[t.charAt(i) - 97]--;
        }

        for(int i = 0 ; i <= 13 ; i++){
            if(count[i] != 0 || count[26-i-1] != 0){
                return false;
            }
        }
        return true;
    }
}