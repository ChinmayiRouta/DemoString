//WAJP to display the 2nd half of the reverse string like(gnimm)
package com.kodnest.strings;

public class Solution9 {

	public static void main(String[] args) {
		String s="Programming";
		for(int i=s.length()-1;i>s.length()/2;i--)
		{
			System.out.print(s.charAt(i)+" ");
		}


	}

}
