	package com.prerequisite.hashing;
	
	import java.util.HashMap;
	import java.util.Map;
	
	public class Session0 {
	//	We are given an Array of Numbers. We have to find and print any Number with Maximum Frequency and Minimum Frequency
		public static void main(String[] args) {
			int[] array = {3, 2, 3, 2, 4, 3};
			int minNum = array[0], minFreq = Integer.MAX_VALUE;
			int maxNum = array[0], maxFreq = Integer.MIN_VALUE;
			
			Map<Integer, Integer> map = new HashMap<>();
			for(int i=0;i<array.length;i++) {
				int num = array[i];
				map.put(num, map.getOrDefault(num, 0)+1);
			}
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				int num = entry.getKey();
				if(map.get(num)<minFreq) {
					minNum = num;
					minFreq = map.get(num);
				}
				if(map.get(num)>maxFreq) {
					maxNum = num;
					maxFreq = map.get(num);
				}
			}
			System.out.println("Num: "+minNum+" having a min frequency of "+minFreq);
			System.out.println("Num: "+maxNum+" having a max frequency of "+maxFreq);
	
		}
	
	}
