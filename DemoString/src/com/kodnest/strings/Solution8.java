//WAJP to display the first half of the reverse string like(argrop)
package com.kodnest.strings;

public class Solution8 {

	public static void main(String[] args) {
		String s="Programming";
		for(int i=s.length()/2;i>=0;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}


	}

}
