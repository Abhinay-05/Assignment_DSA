public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

		StringBuilder sb = new StringBuilder(s);
		int i = 1;
		char ch = sb.charAt(0);
		while(i < sb.length()){
			if(ch == sb.charAt(i)){
				// if current character is equal to the last one
				// delete current
				sb.deleteCharAt(i);
			}
			else{
				// character is not same
				ch = sb.charAt(i);//add current character
				i++;//next element
			}
		}
		return sb.toString();
	}

}
