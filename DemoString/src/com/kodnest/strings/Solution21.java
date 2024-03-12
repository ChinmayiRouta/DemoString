package com.kodnest.strings;

public class Solution21 {

	public static void main(String[] args) {
		String s="prog";
		int i=0;
		int count=0;
		try {
		while(true)
		{
			System.out.println(s.charAt(i));
			count++;
			i++;
		}
	}
		catch(Exception e)
		{
			System.out.println("The length is="+count);
		}
	}
}
