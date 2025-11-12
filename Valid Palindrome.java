class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        int len = s.length();
        for(int i = 0 ; i < len ; i++){
            char ch = s.charAt(i);
            // small letters
            if((ch >= 'a' && ch <= 'z')){
                sb.append(ch);
            }
            // capital letters
            else if((ch >= 'A' && ch <= 'Z')){
                sb.append((char)(ch+32));
            }
            // numeric values
            else if(ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
        }

        int st = 0, end = sb.length() - 1;
        while(st < end){
            if(sb.charAt(st) != sb.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
