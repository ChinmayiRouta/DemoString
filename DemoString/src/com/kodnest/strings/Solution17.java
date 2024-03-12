//input="hello java program"
//output="olleh avaj margorp"

package com.kodnest.strings;

public class Solution17 {

	public static void main(String[] args) {
		String s="hello java program";
		String[]t=s.split(" ");
		for(int i=0;i<t.length;i++)
		{
			StringBuffer str=new StringBuffer(t[i]);
			System.out.print(str.reverse()+" ");
		
		}
	}

}
