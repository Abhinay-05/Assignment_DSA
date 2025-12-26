/*
Most Frequent Character

Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

Examples:

Input: s = "testsample"
Output: 'e'
Explanation: 'e' is the character which is having the highest frequency.

Input: s = "output"
Output: 't'
Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.

*/ 
class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        TreeMap<Character, Integer> alphabets = new TreeMap<>();
        
        int len = s.length();
        for(int i = 0 ; i < len ; i++){
            char ch = s.charAt(i);
            int oldVal = alphabets.get(ch) == null ? 0 : alphabets.get(ch);
            alphabets.put(ch, oldVal+1);
        }
        
        int max = 0;
        char ans = 'a';
        for(Character ch : alphabets.keySet()){
            if(alphabets.get(ch) > max){
                max = alphabets.get(ch);
                ans = ch;
            }
        }
        return ans;
    }
}