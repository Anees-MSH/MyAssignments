package week3.day1;



public class Palindrome {
public static void main(String[] args) {
	String value="madam";
	String rev="";
	char[] ch = value.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		rev=rev+ch[i];
		
	}
	System.out.println(rev);
	if(rev.equals(value))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println(" Not a Palindrome");
	}
}
}