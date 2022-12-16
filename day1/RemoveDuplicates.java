package week3.day1;

public class RemoveDuplicates {
	public static void main(String[] args) {
		
	String text = "We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
	int count=0;
	for (int i = 0; i < split.length; i++) {
		for (int j = i+1; j < split.length; j++) {
			if(split[i].equals(split[j]))
			{
				split[j]=" ";
		
				count++;
			}
		
			}
		if(count<=1||split[i]!=" ")
		{
			System.out.println(split[i]+" ");
		}
		}
	}
	}