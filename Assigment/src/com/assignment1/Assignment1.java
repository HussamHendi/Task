package com.assignment1;

import java.util.Scanner;

public class Assignment1 { 
	
	
	 public static double log2(long n)
	    {
	 
	        // calculate log2 N indirectly
	        // using log() method
	        int result = (int)(Math.log(n) / Math.log(2));
	 
	        return result;
	    }
	 
	   public static String counterGame(long n) {
		

	        boolean chanceLAli = true;
	        while (n!=1) { 

	            if(Math.floor(log2(n))== Math.ceil(log2(n)))
	            {
	                n/=2;
	            }
	            else
	            {
	                n=(long) (n-Math.pow(2,Math.floor(log2(n))));
	            }
	            
	            chanceLAli = !chanceLAli;
	        }
 

	        if (chanceLAli)
	            return "Ali";
	        else
	            return "naser";

		}	

		
	public static void main(String[] args) {
 		Scanner in = new Scanner(System.in);
		System.out.print("enter number :");
		long n = in.nextLong();
		 String result = counterGame(n);
		 
		 System.out.println( "the win is : " + result);
				
		

}}
