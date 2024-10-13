package com.prerequisite.hashing;

public class Session2 {

	public static void main(String[] args) {
//		Count all the (i,j) Pairs such that b[i] + b[j] == k (count of such pairs.) [i<j] 
		int[] arr = {1, 2, 3, 4, 5};
        int k = 6;
        findPairsWithBruteForce(arr, k);

	}
	private static void findPairsWithBruteForce(int[] arr, int k) {
//		b[i] + b[j] == k
//		b[j] = k - b[i]
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] == k - arr[i]) {
					System.out.println("Found such a pair at i:"+i+" j:"+j+" i.e. "+arr[i]+","+arr[j]);
				}
			}
		}
	}

}
