package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

public class Session3 {
//	Count All ((i,j) pairs such that b[i] - b[j] == k (count of such pairs.) [i<j]
	public static void main(String[] args) {
		int[] b = {1, 5, 3, 4, 2};
        int k = 2;
        int pairs = findPairsByBruteForce(b, k);
	}
	private static int findPairsByBruteForce(int[] b, int k) {
		int count=0;
//		b[i] - b[j] == k
//		b[i] == k + b[j];
		for(int i=0;i<b.length-1;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i] - b[j] == k) {
					System.out.println("Found pair at index i:"+i+" j:"+j+" i.e. "+b[i]+","+b[j]);
					count++;
				}
			}
		}
		return count;
	}
	

}
