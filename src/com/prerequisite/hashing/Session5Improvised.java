package com.prerequisite.hashing;

import java.util.Scanner;

public class Session5Improvised {

	public static void main(String[] args) {
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//           {0, 1, 3, 6, 10, 15, 21, 28, 36, 45}
		// 45 - 15 = 30
        int l = 3, r = 7; // Example range [l, r]
        int[] prefixSum = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
        	sum += nums[i];
        	prefixSum[i] = sum; 
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("How many queries?");
        int q = sc.nextInt();
        for(int i=0;i<q;i++) {
        	System.out.println("Enter L:");
        	l = sc.nextInt();
        	System.out.println("Enter R:");
        	r = sc.nextInt();
        	int rangeSum = (l > 0) ? prefixSum[r] - prefixSum[l - 1] : prefixSum[r]; //main logic

        	System.out.println("Sum:"+rangeSum);
        }

	}

}
