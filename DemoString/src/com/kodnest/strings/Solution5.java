//WAJP to display all the character in reverse order
package com.kodnest.strings;

public class Solution5 {

	public static void main(String[] args) {
		String s="Programming";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}
	}

}


