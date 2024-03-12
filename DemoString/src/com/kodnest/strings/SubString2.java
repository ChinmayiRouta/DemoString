package com.kodnest.strings;

public class SubString2 {

	public static void main(String[] args) {
		String s="Java";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				for(int k=i;k<j;k++)
				{
					System.out.println(s.charAt(k));
				}
				System.out.println();
			}
		}
	}

}
