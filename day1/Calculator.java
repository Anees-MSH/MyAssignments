package week1.day1;

public class Calculator {


public int add(int a,int b)
	{ int r=a+b;
		return r;
	}
public int add1(int a,int b,int c)
    {
	int r=a+b+c;
	return r;
}
public int multiply(int a,int b)
{
	int r=a*b;
	return r;
}
public double multiply1(int a,double b)
{
	double r=a*b;
	return r;
}
public int subtract(int a,int b)
{
	int r=a-b;
	return r;
}
public double subtract1(double a,double b)
{
	double r=a-b;
	return r;
}
public int divide(int a,int b)
{
	int r=a/b;
	return r;
}
public double divide1(double a,int b)
{
	double r=a/b;
	return r ;
}
public static void main(String[] args) {
	Calculator obj=new Calculator();
	
	System.out.println(obj.add(5,5));
	System.out.println(obj.add1(5,6,8));
	System.out.println(obj.multiply(3,5));
	System.out.println(obj.multiply1(5,7));
	System.out.println(obj.divide(5,5));
	System.out.println(obj.divide1(5.5,5));
	System.out.println(obj.subtract(5,9));
	System.out.println(obj.subtract1(5.5, 2.2));
}


}
