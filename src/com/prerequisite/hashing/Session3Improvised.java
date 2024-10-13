package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session3Improvised {
//	Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j]
	public static void main(String[] args) {
		int[] b = {1, 5, 3, 4, 2};
        int k = 2;
        int pairs = findPairsByBruteForce(b, k);
	}
	private static int findPairsByBruteForce(int[] b, int k) {
		int count=0;
		Map<Integer, Integer> map = new HashMap<>(); 
//		b[i] - b[j] == k
//		b[i] == k + b[j];
		for(int i=0;i<b.length;i++) {
			if(map.containsKey(k+b[i])) {
				System.out.println("Found pair at index i:"+map.get(k+b[i])+" j:"+i+" i.e. "+(k+b[i])+","+b[i]);
				count++;
			}
			map.put(b[i], map.getOrDefault(b[i], 0)+1);
		}
		return count;
	}
	

}
