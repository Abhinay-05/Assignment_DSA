#include <bits/stdc++.h>
using namespace std;

vector<int> nextGreaterElement(vector<int>& sub, vector<int>& arr ) {
        unordered_map<int, int> map;
        int m = sub.size(), n = arr.size();
        for(int i = 0 ; i < n ; i++){
            map[arr[i]] = i;
        }

        for(int i = 0 ; i < m ; i++){
            int curr = sub[i];
            sub[i] = -1;
            for(int j = map[curr]+1 ; j < n ; j++){
                if(arr[j] > curr){
                    sub[j] = arr[j];
                    break;
                }
            }
        }
        return sub;
    }

int main(){
    vector<int> sub = {4,1,2};
    vector<int> arr = {1,3,4,2};
    sub = nextGreaterElement(sub, arr);
    for(int el : sub){
        cout<<el<<" ";
    }
}    