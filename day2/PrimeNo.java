package week1.day2;
public class PrimeNo {

	public static void main(String[] args) {
		int n=13;
		int count=0;
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				count++;
			}
				if(count==2)	
				{
				System.out.println("Prime number");
				
			    }
				else
				{
				System.out.println("Not a prime number");
				}
		}	        
		        else
		        {
			    System.out.println("Not a prime number");
		        }
				
	
}
}


