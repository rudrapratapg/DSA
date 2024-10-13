package com.prerequisite.hashing;

public class Session1 {
//Check if there are any two Equal numbers in an array at a distance less than or equal to k
	public static void main(String[] args) {
		int[] nums = {1, 1, 3, 1, 2, 3};
        int k = 2;
        if(nums.length<k) {
        	System.out.println("NO");
        } else {
        	containsDuplicatesNearBy_BruteForce(nums, k);
        }

	}
	
	private static void containsDuplicatesNearBy_BruteForce(int[] nums, int k) {
		for(int i=0;i<nums.length-k; i++) {
			for(int j=i+1;j<=i+k;j++) {
				System.out.println("i:"+i+" j:"+j);
				if(nums[i]==nums[j]) {
					System.out.println("Found a duplicate for "+nums[i]+" within "+(j-i)+" distance.");
				}
			}
		}
	}

}
