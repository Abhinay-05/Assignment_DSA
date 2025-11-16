class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < len ; i++){
            int ch = s.charAt(i);

            if(ch == '('){
                st.push(')');
            }
            else if(ch == '['){
                st.push(']');
            }
            else if(ch == '{'){
                st.push('}');
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                if(ch != st.peek()){
                    return false;
                }
                if(ch == st.peek()){
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
