package com.prerequisite.hashing;

public class Session4 {
//Count all i,j pairs where i<j and abs(b[i]-b[j]) = k [k>=0]
	public static void main(String[] args) {
		int[] b = {1, 7, 5, 9, 2, 12, 3};
        int k = 2;
        findPairsByBruteForce(b, k);
	}
	
	private static void findPairsByBruteForce(int[] b, int k) {
		int count=0;
		for(int i=0;i<b.length-1;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(Math.abs(b[i]-b[j])==k && k>=0) {
					System.out.println("Found pair at index i:"+i+" j:"+j+" i.e. "+b[i]+","+b[j]);
					count++;
				}
			}
		}
		System.out.println("Total count : "+count);
	}

}
