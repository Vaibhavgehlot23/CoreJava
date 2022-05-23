package com.Assignment414;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
	
   int n = 153;
   int s = 0;
   int r;
   int temp;
   
          temp =n;
   
    while(n>0){
    r= n%10;
    
    s=(r*r*r)+s;
    n=n/10;
    
    }
  
    if(temp == s) {
    	System.out.println("It is a Armstrong number -- "+s);
    }
    else { System.out.println("It is not a armstrong number");
    }
    }
}
