package day2;

public class ReverseNum {
 
	public static void main(String[] args)   
	{  
	int number = 27, reverse = 0;  
//	while(number != 0)   
//	{  
//	int remainder = number % 10;  
//	reverse = reverse * 10 + remainder;  
//	number = number/10;  
//	}  
//	System.out.println("The reverse of the given number is: " + reverse);  
	
	  
//	do{  
//	int remainder = number % 10;  
//	reverse = reverse * 10 + remainder;  
//	number = number/10;   
//	}while(number != 0);  
//	System.out.println("The reverse of the given number is: " + reverse); 
	  
	for(;number!=0;) {
		  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
	}
	System.out.println("The reverse of the given number is: " + reverse);
	}
}
