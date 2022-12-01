package week1.day2;

import java.util.Arrays;

public class SecondSmallestArray {
public static void main(String[] args) {
	
	int[] nums= {23,45,67,32,89,22};
	int len=nums.length;
	Arrays.sort(nums);
	System.out.println(" second smallest number:"+nums[1]);
	System.out.println(" largest:"+nums[len-1]);
}
}
