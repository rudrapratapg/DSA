package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session4Improvised {

	public static void main(String[] args) {
		int[] b = {1, 5, 3, 4, 2};
        int k = 2;
        findPairsByBruteForce(b, k);
	}
	
	private static void findPairsByBruteForce(int[] b, int k) {
		int count=0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<b.length;i++) {
			if(map.containsKey(b[i]+k)) {
				count= count + map.get(b[i]+k);
			}
			if(map.containsKey(b[i]-k)) {
				count = count + map.get(b[i]-k);
			}
			map.put(b[i], map.getOrDefault(b[i], 0)+1);
		}
		System.out.println("Total count : "+count);
	}

}
