package com.kmehra.sample.solvingpatterns;

// Multiple Pointer Pattern- WAF (Write a function)
//  which takes in two strings and checks whether the characters
// in the first string form a subsequence of the characters in 
// the second string. In other words, the function should check 
// whether the characters in the first string appear somewhere in 
// the second string, without their order changing.

public class MPPSubsequence {

	public static boolean isSubsequence(String str1, String str2) {
		
		boolean isSub = false;
		int pos = 0;
		char[] carray1 = str1.toCharArray();
		char[] carray2 = str2.toCharArray();
		
		
		
		for(int i = 0; i<carray2.length; i++) {
			
			char c1 = carray1[pos];
			char c2 = carray2[i];
			
			if(c1 == c2) {
				
				if(pos == carray1.length - 1) {
					isSub = true;
					break;
				}
				
				pos++;
				
			} 
		}
		
		return isSub;
	}
	
	public static void main(String args[]) {
		
		String str1 = "abc";//"abc";//"sing";//"hello";
		String str2 = "acb";//"abracadabra";//"sting";//"hello world";
		
		boolean isSub = isSubsequence(str1, str2);
		
		System.out.println("\"" + str1 +"\" is Subsequence of \"" + str2 + "\" : " + isSub);
	}
	
}
