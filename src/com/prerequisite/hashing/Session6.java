package com.prerequisite.hashing;

public class Session6 {

//	Find count of number of subarrays with sum ==  k
	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 2, 10, 8};
		int targetsum = 3;
		int pairs = findPairsUsingBruteForce(arr, targetsum);
		System.out.println("Pairs:"+pairs);
	}
	
	private static int findPairsUsingBruteForce(int[] arr, int targetSum) {
		int pairs=0;
		for(int i=0;i<arr.length;i++) {
			int currentSum =0;
			for(int j=i;j>0;j--) {
				currentSum = currentSum+arr[j];
				if(currentSum==targetSum) pairs++;
			}
		}
		return pairs;
	}

}
