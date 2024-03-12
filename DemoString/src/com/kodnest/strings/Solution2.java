package com.kodnest.strings;

public class Solution2 {

	public static void main(String[] args) {
		String s="programming";
		//fetch the individual characters
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
		int j=0;
		while(j<s.length())
		{
			System.out.println(s.charAt(j)+" ");
			j++;
		}
		int k=0;
		do
		{
			System.out.println(s.charAt(k)+" ");
			k++;
		}while(k<s.length());
	}

}
