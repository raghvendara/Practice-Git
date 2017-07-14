package com.alacriti.freshers17;

import java.util.Scanner;

public class App 
{
	public static void main( String[] args )
    {
    	System.out.println( "Enter a String to manipulate : " );
    	
    	Scanner scan=new Scanner(System.in);
 
        String inputString=scan.nextLine();
        
        StringFunctions app=new StringFunctions();
        
        app.getSubString(inputString); 
        app.getLowerCase(inputString);
        app.getUpperCase(inputString);
        app.trimString(inputString);
 

    	scan.close();

    }
}
