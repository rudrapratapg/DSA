package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session7Improvised {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, -1, -4};
        int k = 9;
        int[] result = findLargestSubArrayPrefixSum(nums, k);
        if(result[0]>=0) {
        	System.out.println("From "+result[0]+" to "+result[1]+" sums up to "+k);
        } else {
        	System.out.println("there is no such pair which susm up to "+k);
        }
	}
	private static int[] findLargestSubArrayPrefixSum(int[] arr, int targetSum) {
		int[] result = {-1,-1};
		Map<Integer, Integer> sumIndexMap = new HashMap<>();
		int currentSum = 0, maxLength = 0;
		for(int i=0;i<arr.length;i++) {
			currentSum += arr[i];
			if(sumIndexMap.containsKey(currentSum - targetSum)) {
				int length = i - sumIndexMap.get(currentSum - targetSum);
				if(length>maxLength) {
					maxLength = length;
					result[0] = sumIndexMap.get(currentSum - targetSum)+1;
					result[1] = i;
				}
			}
			if(!sumIndexMap.containsKey(sumIndexMap)) {
				sumIndexMap.put(currentSum, i);
			}
		}
		return result;
	}

}
