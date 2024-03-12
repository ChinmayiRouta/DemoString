//frequency of given character
package com.kodnest.strings;

public class Anagram {

	public static void main(String[] args) {
		int count=0;
		String s="String";
		char ch='r';
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println("Frequency of"+ch+"=is "+count);

	}

}
