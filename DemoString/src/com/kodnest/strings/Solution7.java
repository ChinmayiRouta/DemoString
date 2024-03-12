//WAJP to display the 2nd half of the string like (mming)
package com.kodnest.strings;

public class Solution7 {

	public static void main(String[] args) {
		String s="Programming";
		for(int i=s.length()/2+1;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}


	}

}