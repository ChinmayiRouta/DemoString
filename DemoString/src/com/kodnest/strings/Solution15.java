//pallindrom String
package com.kodnest.strings;

public class Solution15 {

	public static void main(String[] args) {
		String s="madam";
		StringBuffer str=new StringBuffer(s);
		StringBuffer reverse=str.reverse();
		String str2=reverse.toString();
		if(s.equals(str2))
		{
			System.out.println("Pallindrom");
		}
		else {
			System.out.println("not pallindrom");
		}
	}
}
