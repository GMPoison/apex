package methodVersions;

import java.util.Scanner;

public class No_Method {

	public static void main(String[] args) {
		 
		System.out.println("This program was written by Daniel Pytlarz");
		System.out.println("-----------------------------");
		
		String varName;
        System.out.print("Enter your name: ");
        Scanner readStuff = new Scanner(System.in);
        varName = readStuff.nextLine();
       
        for (int loop = 0; loop <5; ++loop){
        
        		//Integers
        	
        	System.out.println("");
        	System.out.println("Trial " + (loop+1) + " Integers: ");
	        int fNum, sNum, sum, differ, prod, qot, remain;
	        System.out.print("Please enter your first number: ");
	        fNum = readStuff.nextInt();
	        System.out.print("Please enter your second number: ");
	        sNum = readStuff.nextInt();
	        System.out.println();
	        
	        sum = fNum + sNum;
	        differ = fNum - sNum;
	        prod = fNum * sNum;
	       
	        System.out.println(varName + ", The sum of " + fNum + " and " + sNum + " is " + sum);
	        System.out.println(varName + ", The difference of " + fNum + " and " + sNum + " is " + differ);
	        System.out.println(varName + ", the product of " + fNum + " and " + sNum + " is " + prod);
	        
	        if(sNum == 0){ 
	        	System.out.println(varName + ", you cannot divide by 0. Remainder and quotent not available. ");
	        	
	        } else{
	        	qot = fNum / sNum;
		        remain = fNum % sNum;
		        
		        System.out.println(varName + ", The product of " + fNum + " and " + sNum + " is " + prod);
		        System.out.println(varName + ", The quotient of " + fNum + " and " + sNum + " is " + qot + "r" + remain);
	        }
	        
	        System.out.println();
	               
	        	//Doubles
	        
	        System.out.println("Trial " + (loop+1) + " Doubles: ");
	        double fNumD, sNumD, sumD, differD, prodD, qotD, remainD;
	        System.out.print("Please enter your first number: ");
	        fNumD = readStuff.nextDouble();
	        System.out.print("Please enter your second number: ");
	        sNumD = readStuff.nextDouble();
	        System.out.println();
	        	        
	        sumD = fNumD + sNumD;
	        differD = fNumD - sNumD;
	        prodD = fNumD * sNumD;
	       	       
	        System.out.println(varName + ", The sum of " + fNumD + " and " + sNumD + " is " + sumD);
	        System.out.println(varName + ", The difference of " + fNumD + " and " + sNumD + " is " + differD);
	        System.out.println( varName + ", the product of " + fNumD + " and " + sNumD + " is " + prodD);
	        
	        if(sNumD == 0){ 
	        	System.out.println(varName + ", you cannot divide by 0. Remainder and quotent not available. ");
	        	
	        } else{
	        		qotD = fNumD / sNumD;
	        		remainD = fNumD % sNumD;
	        		
	        		System.out.println(varName + ", The product of " + fNumD + " and " + sNumD + " is " + prodD);
	        		System.out.println(varName + ", The quotient of " + fNumD + " and " + sNumD + " is " + qotD + "r" + remainD);
	        	  }
	    
	      }
               
        System.out.println("");
        System.out.println("This program was run by: " + varName);
                      
        readStuff.close();
        
	}

}