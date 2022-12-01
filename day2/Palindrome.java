package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	int num=34343;
	int sum=0;
	int rem;
	int temp;
	temp=num;
	while(num>0)
	{
		rem=num%10;
		sum=(sum*10)+rem;
		num=num/10;
		
	}
	
	if(sum==temp)
	{
		System.out.println("The given number is Palindrome");
	}
	else
	{
		System.out.println("The given number is not a Palindrome");
	}
}
}
