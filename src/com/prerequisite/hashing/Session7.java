package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session7 {
//	Find largest/smallest subarray with sum k in Given Array

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, -1, 6};
        int k = 9;
        int[] result = findLargestSubArrayBruteForce(nums, k);
        if(result[0]>=0) {
        	System.out.println("From "+result[0]+" to "+result[1]);
        }

	}
	private static int[] findLargestSubArrayBruteForce(int[] nums, int k) {
		int[] result = {-1,-1};
		int maxLength = 0;
		for(int i=0;i<nums.length;i++) {
			int currentSum =0;
			for(int j=i;j<nums.length;j++) {
				currentSum = currentSum + nums[j];
				if(currentSum==k) {
					int length = j-i+1;
					if(length>maxLength) {
						maxLength = length;
						result[0] = i+1;
						result[1] = j+1;
					}
				}
			}
		}
		System.out.println("Largest subarray length:"+maxLength);
		return result;
	}

}
