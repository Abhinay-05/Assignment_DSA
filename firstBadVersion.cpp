#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int firstBadVersion(int n) {
        int s = 1;
        while(s < n){
            int mid = s + (n - s)/2;
            if(isBadVersion(mid)){
                n = mid;
            }
            else{
                s = mid+1;
            }
        }
        return n;
    }
};