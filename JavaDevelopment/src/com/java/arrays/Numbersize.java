package com.java.arrays;

public class Numbersize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {1,15,2,25,5,45,69};
		int small=nums[0];
		for(int i=0; i<nums.length;i++) {
			if (small>nums[i]) 
				 small=nums[i];
				}
		
		System.out.println("The Smallest valuse is = "+ small);
		
		int large= nums[0];
		for(int i=0; i<nums.length;i++) {
			if (large<nums[i]) 
				 large=nums[i];
				}
		
		System.out.println("The Largest valuse is = "+ large);
}
}
