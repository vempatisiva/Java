package com.java.arrays;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {4, 2, 9, -3, 5, 1,9};
	        int target=5;
	        System.out.println("Target value is " + target);
	      int count=0;
	        for (int i = 0; i <a.length; i++) {
	            if(a[i]==target)
	                {
	                    System.out.println("Target found at index " + i);
	                    count++;
	                }
	        }
	    if(count==0)
	          System.out.println("Target not found at index " );

	    }
	}


