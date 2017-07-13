package com.alacriti.freshers17;

import java.util.Scanner;

public class StringFunctions {

	public  void getSubString(String inputString)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("enter starting and ending index of the substring in given string :");
    	int startingIndex,endingIndex;
    	startingIndex=scan.nextInt();
    	endingIndex=scan.nextInt();
    	System.out.println("sub string of the given one is :"+inputString.substring(startingIndex, endingIndex));
    	scan.close();
    }
    public  void getLowerCase(String inputString)
    {
    	System.out.println("lower case string of the given one is :"+inputString.toLowerCase());
    }
    public  void getUpperCase(String inputString)
    {	
    	System.out.println("upper case string of the given one is :"+inputString.toUpperCase());
    }
    public void trimString(String inputString)
    {
    	System.out.println("trimmed version of the given one is :"+inputString.toUpperCase());
    }
 
}
