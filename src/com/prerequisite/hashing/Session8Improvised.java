package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session8Improvised {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 2, 5};
//		int[] nums = {3, 1, 2, 1, 3, 6};
        int k = 5;
        int shortestSubArray = countShortestSubArray(nums, k);
        int largestSubArray = countLargestSubArray(nums, k);

	}
	private static int countShortestSubArray(int[] arr, int k) {
		int count=0, pSum=0, n=arr.length, minLength=Integer.MAX_VALUE;
		Map<Integer, Integer> sumIndexMap = new HashMap<>();
		for(int j=0;j<n;j++) {
			pSum = pSum + arr[j];
			int x = pSum - k;
			System.out.println("Checking if we have "+x+" in map | pSum:"+pSum);
			if(sumIndexMap.containsKey(x)) {
				int currentLength = j - sumIndexMap.get(pSum - k);
				if(currentLength<minLength) {
					minLength = currentLength;
					count=1;
				} else if(currentLength==minLength) {
					count++;
				}
			}
			sumIndexMap.putIfAbsent(pSum, j);
		}
		System.out.println("Min Length: "+minLength+" Count: "+count);
		return minLength;
	}
	private static int countLargestSubArray(int[] arr, int k) {
		int count=0, maxLength=0, n=arr.length, pSum=0;
		Map<Integer, Integer> sumIndexMap = new HashMap<>();
		for(int i=0;i<n;i++) {
			pSum = pSum + arr[i];
			if(sumIndexMap.containsKey(pSum - k)) {
				int currLength = i - sumIndexMap.get(pSum-k);
				if(currLength>maxLength) {
					maxLength = currLength;
					count=1;
				} else if(currLength == maxLength) {
					count++;
				}
			}
			sumIndexMap.putIfAbsent(pSum, i);
		}
		System.out.println("Max Length: "+maxLength+" Count: "+count);
		return maxLength;
	}

}
