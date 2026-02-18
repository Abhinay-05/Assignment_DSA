#include <bits/stdc++.h>
using namespace std;   
   
   // TC: O(n)
    // SC: O(1)
    int lengthOfLongestSubstring(string s) {
        vector<int> freq(256,0);//faster than map
        int n = s.size();
        int ans = 0;

        int st = 0;//start of the substring
        for(int end = 0 ; end < n ; end++){//end of the substring
            freq[s[end]]++;//update substring[end] count

            while(freq[s[end]] > 1){
                //if the end element's count > 1
                //remove first index
                freq[s[st]]--;//reduce frequency of [st]
                st++;//remove [st]
            }
            ans = max(ans, end-st+1);//update answer
        }
        return ans;
    }

    int main(){
        string s = "abcabcbb";
        cout<<lengthOfLongestSubstring(s)<<endl;//3

        s = "bbbbb";
        cout<<lengthOfLongestSubstring(s)<<endl;//1

        s = "pwwkew";
        cout<<lengthOfLongestSubstring(s)<<endl;//3
    }