package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session6Improvised {

	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 2, 10, 8};
//		            {1, 1, 2, 4, 14, 22}
		int targetsum = 3;
		int pairs = findPairsUsingPrefixSum(arr, targetsum);
		System.out.println("Pairs:"+pairs);
	}
	private static int findPairsUsingPrefixSum(int[] arr, int targetSum) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int count=0, sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(map.containsKey(sum-targetSum)) {
				count = count+map.get(sum-targetSum);
			} else {
				map.put(sum, map.getOrDefault(sum, 0)+1);
			}
		}
		return count;
	}

}
