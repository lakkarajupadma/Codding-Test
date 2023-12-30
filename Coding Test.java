package com.anp.exceptionhandling;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		//Create a scanner object to read user input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a String:");
		//Read the user input
		String input=sc.nextLine();
	
		try {
			//call the reverseString method and store the reversed string in a variable
			String reversed=reverseString(input);
			System.out.println("Reversed String is: "+reversed);
		}catch(NullPointerException e)
		{//Handle the case when the user enters a null string
			System.out.println("Oh! You entered a null String");
		
		}
	}
		public static String reverseString(String str) {
			//Check if the input string is null
			if(str==null) {
				//throw new NullPointerException();
			}
			StringBuilder reversed=new StringBuilder();
			for(int i=str.length()-1;i>=0;i--) {
				reversed.append(str.charAt(i));
			}
		
			return reversed.toString();	
		
	}

}

