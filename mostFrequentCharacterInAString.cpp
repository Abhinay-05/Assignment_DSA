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
  public:
    char getMaxOccuringChar(string& s) {
        //  code here
        int len = s.size();
        int alphabets[26] = {0};
        for(int i = 0 ; i < len ; i++){
            char ch = s[i];
            alphabets[ch - 97]++;
        }
        int freq = 0;
        int max = 25;
        for(int i = 25 ; i >= 0 ; i--){
            if(alphabets[i] >= freq){
                max = i;
                freq = alphabets[i];
            }
        }
        return (char)(97+max);
    
    }
};