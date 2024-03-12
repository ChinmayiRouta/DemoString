//WAJP to convert a String to an Array and display array elements.
package com.kodnest.strings;
public class Solution10 {

	public static void main(String[] args) {
		String s="Program";
		s.toCharArray();
		char ch[]=s.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.println(ch[i]);
		}

	}

}
