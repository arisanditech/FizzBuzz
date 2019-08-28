package com.me.vd.main;

public class test{
	public static void main(String[] args){
		
		 int n = 100; 
		  
	        // loop for 100 times 
	        for (int i=1; i<=n; i++)                                  
	        { 
	            if (i%15==0)                                                  
	                System.out.println("FizzBuzz"+" ");  
	            // number divisible by 5, print 'Buzz'  
	            // in place of the number 
	            else if (i%5==0)      
	                System.out.println("Buzz"+" ");  
	  
	            // number divisible by 3, print 'Fizz'  
	            // in place of the number 
	            else if (i%3==0)      
	                System.out.println("Fizz"+" ");  
	  
	            // number divisible by 15(divisible by 
	            // both 3 & 5), print 'FizzBuzz' in  
	            // place of the number 
	                  
	            else // print the numbers 
	                System.out.println(i+" ");                          
	        } 
		int a =10;
		for (int i = 1; i <= a; i++) {
			for (int j = a; j >=i; j--) {
				System.out.print("[*]");
			}
		}
		int j = 10;
		while(j<=10){
			System.out.println(j);
			j+=2;
		}
		int k = 0;
		do{
			System.out.print(k);
			k+=2;
		}
		while(k<=10);
	}

}
