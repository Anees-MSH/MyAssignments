package week1.day2;
public class MissingElementsInAnArray{
public static void main(String[] args) {
	int arr[] = {1,2,3,4,7,6,8};
	
	int sum1=0;
	int sum2=0;

	for(int i=0;i<arr.length;i++)
	{
		sum1=sum1+arr[i];
	}
	System.out.println("Sum of elements in array ="+sum1);
		
	for(int j=1;j<=8;j++)
	{
		sum2=sum2+j;
	}
System.out.println("sum of range of elements= "+sum2);
System.out.println("The Missing number in an array is "+(sum2-sum1));
}
}
