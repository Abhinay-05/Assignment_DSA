#include <bits/stdc++.h>
using namespace std;

vector<int> nextGreaterElement(vector<int>& sub, vector<int>& arr ) {
        unordered_map<int, int> map;
        int m = sub.size(), n = arr.size();

        for(int i = 0 ; i < n ; i++){
            map[arr[i]] = -1;
        }

        stack<int> st;
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.empty() && st.top() < arr[i]){
                st.pop();
            }

            if(!st.empty()){
                map[arr[i]] = st.top();
                st.push(arr[i]);
            }
            else{
                // stack is empty
                st.push(arr[i]);
            }
        }
        for(int i = 0 ; i < m ; i++){
            sub[i] = map[sub[i]];
        }
        return sub;
    }

int main(){
    vector<int> arr = {5, 1, 2, 4, 3};
    vector<int> sub(arr);
    sub = nextGreaterElement(sub, arr);
    for(int el : sub){
        cout<<el<<" ";
    }
}    