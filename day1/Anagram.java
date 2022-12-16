package week3.day1;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss";
	if(text1.length()==text2.length())
	{
		System.out.println("length of the string is equal");
	   char ch1[]=text1.toCharArray();
	   //System.out.println(text1.toCharArray());
	    char ch2[]=text2.toCharArray();
	    //System.out.println(text2.toCharArray());
	  Arrays.sort(ch1);
	 System.out.println(ch1);
	  Arrays.sort(ch2);
	  System.out.println(ch2);  
	if(ch1.equals(ch2))
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
	}
  else
	{
		System.out.println("length of the string is not equal");
	}

	
	
	
	
	
}
}
