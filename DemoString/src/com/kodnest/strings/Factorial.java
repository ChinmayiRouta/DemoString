package com.kodnest.strings;
import java.util.Scanner;
public class Factorial {
	/*public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
		      fact=fact*i;  
		}
		System.out.println("factorial number is"+n+"is:"+fact);
	}

}*/


public static int factorial(int n){    
	  if (n == 0)    
	    return 1;    
	  else    
	    return(n * factorial(n-1));    
	 }    
	 public static void main(String args[]){  
		 Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=scan.nextInt();
	  int fact=1;  
	  
	  fact = factorial(n);   
	  System.out.println("Factorial of "+n+" is: "+fact);    
	 }  
	}  