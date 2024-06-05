package com.assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Assignment2 {



	public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

	        if(y1>y2){
	            return 10000;
	        }else if(m1>m2 && y1==y2){
	            return 500 *(m1-m2);
	        }else if(d1>d2 && m1==m2 && y1==y2){ 
	            return 15*(d1-d2);
	        }else{
	            return 0;
	        }
	    }

	
	
	
   public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
 
		        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		        int d1 = Integer.parseInt(firstMultipleInput[0]);

		        int m1 = Integer.parseInt(firstMultipleInput[1]);

		        int y1 = Integer.parseInt(firstMultipleInput[2]);

		        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		        int d2 = Integer.parseInt(secondMultipleInput[0]);

		        int m2 = Integer.parseInt(secondMultipleInput[1]);

		        int y2 = Integer.parseInt(secondMultipleInput[2]);

		        int result = libraryFine(d1, m1, y1, d2, m2, y2);

		        
		        System.out.println("result="+result);
		         
		    

	}

}
