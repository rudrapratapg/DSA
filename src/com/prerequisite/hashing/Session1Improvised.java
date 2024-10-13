package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session1Improvised {

	public static void main(String[] args) {
		int[] nums = {1, 1, 3, 1, 2, 3};
        int k = 2;
        if(containsDuplicateNearBy_LastOccurence(nums, k)) {
        	System.out.println("Contains dublicate wihin range of "+k+" distance.");
        }

	}
	public static boolean containsDuplicateNearBy_LastOccurence(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0;i<nums.length;i++) {
//			map.put(nums[i], i);
//		}
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int diff = map.get(nums[i]) - i;
				if(diff<=k && diff!=0) {
					System.out.println("Found duplicate for "+nums[i]);
					return true;
				}				
			}
			map.put(nums[i], i);
		}
		return false;
	}

}
