package com.prerequisite.hashing;

public class Session8 {

//	Find count of shortest/largest subarrays with sum k in given array
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 2, 5};
        int k = 5;
        int shortestSubArray = countShortestSubArray(nums, k);
        int largestSubArray = countLargestSubArray(nums, k);
        System.out.println("ShortestSubArray:"+shortestSubArray);
        System.out.println("LargestSubArray:"+largestSubArray);
	}
	private static int countLargestSubArray(int[] nums,int targetValue) {
		int count=0, maxLength=Integer.MIN_VALUE;
		int n = nums.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=nums[j];
				int length = (j-i) + 1;
				if(sum==targetValue) {
					if(length>maxLength) {
						maxLength = length;
						count=1;
					} else if(length==maxLength) {
						count++;
					}
				}
			}
		}
		return count;
	}
	private static int countShortestSubArray(int[] nums,int targetValue) {
		int count=0, minLength=Integer.MAX_VALUE;
		int n = nums.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
				sum+=nums[j];
				int length = (j-i)+1; 
				if(sum==targetValue) {
					if(length < minLength) {
						minLength = length;
						count=1;						
					} else if(length==minLength) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
