//input="hello java program"
//output="program java hello"

package com.kodnest.strings;
public class Solution16 {
	public static void main(String[] args) {
		String s="hello java program";
		String[]t=s.split(" ");
		for (int i =t.length-1; i>=0; i--) {
			System.out.print(t[i]+" ");
			
		}
		

	}

}
