package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session2Improvised {

	public static void main(String[] args) {
//		Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 
		int[] arr = {1, 2, 3, 4, 5};
        int k = 6;
        int totalPairs = findPairsUsingPrefixSum(arr, k);
        System.out.println("Total Pairs: "+totalPairs);
	}
	public static int findPairsUsingPrefixSum(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count=0; 
//		b[j] == k - b[i]
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(k-arr[i])) {
				System.out.println("Found pair at index i:"+map.get(k-arr[i])+" j:"+i+" i.e. "+(k-arr[i])+","+arr[i]);
				count++;
			}
			map.put(arr[i], i);
		}
		return count;
	}

}
