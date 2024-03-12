//WAJP convert immutable to mutable string
package com.kodnest.strings;
public class Solution13 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("hello");
		String str=new String(s);
		System.out.println(str);

	}

}
