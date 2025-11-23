#include <bits/stdc++.h>
using namespace std;

class MinStack {
public:

    vector<int> v;
    int top;
    MinStack() {
        top = -1;
    }
    
    void push(int val) {
        v.emplace_back(val);
        top++;
    }
    
    void pop() {
        v.pop_back();
        top--;
    }
    
    int top() {
        return v.at(top);
    }
    
    int getMin() {
        return *min_element(v.begin(), v.end());
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */