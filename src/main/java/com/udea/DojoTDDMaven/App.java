package com.udea.DojoTDDMaven;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		String result = "";
		String num = "";
		CodeBreaker codeBreaker = new CodeBreaker();
		while(!result.equals("xxxx")){
			System.out.println("Ingrese un número");
	        Scanner in = new Scanner (System.in); 
	        num = in.nextLine();
			result = codeBreaker.guess(num);
			System.out.println(result);	
		}
    }
}
