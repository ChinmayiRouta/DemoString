//input="hello java program"
//output="margorp avaj olleh"

package com.kodnest.strings;
public class Solution18 {
	public static void main(String[] args) {
		String s="hello java program";
		String[]t=s.split(" ");
		for(int i=t.length-1;i>=0;i--)
		{
			StringBuffer str=new StringBuffer(t[i]);
			System.out.print(str.reverse()+" ");
		}

	}

}
