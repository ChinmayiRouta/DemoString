//WAJP convert mutable to immutable string.
package com.kodnest.strings;

public class Solution12 {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("hello");
		String str=new String(s);
		System.out.println(str);
	}

}
