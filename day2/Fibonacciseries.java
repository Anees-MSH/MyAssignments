package week1.day2;

import java.util.Arrays;

public class Fibonacciseries {
public static void main(String[] args) {
	
int range=8,firstNum=0,secNum=1,sum=0;
	for(int i=0;i<range;i++)
		
	{
		sum=firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println("Fibonacci Series"+sum);
	}
		
	
		
			
			
	}
}
