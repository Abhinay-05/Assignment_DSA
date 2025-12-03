#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> map;// [element : index]
        int len = nums.size();

        for(int i = 0 ; i < len ; i++){
            int need = target - nums[i];// element that is required for the current element
            
            if(map.find(need) != map.end()){
                // if the current need is available
                return {map[need], i};
            }
            // add current element to the hashMap
            map[nums[i]] = i;
        }
        // if no answer exists
        return {-1, -1};
    }
};