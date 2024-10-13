package com.prerequisite.hashing;

public class Session5 {

//	 Find Sum of Range  [l……….r] where(l<=r) using Prefix sum.
	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = 3, r = 7; // Example range [l, r]
        int sum =0;
        for(int i=l;i<r;i++) {
        	sum = sum + nums[i];
        }
        System.out.println("Sum:"+sum);

	}

}
