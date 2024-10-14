package com.prerequisite.hashing;

/**
 * This class provides methods to find the count of shortest and largest subarrays 
 * with a given sum in a provided array.
 */
public class Session8 {

    /**
     * Main method to test the functionality of the class.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2, 5};
        int k = 5;
        int shortestSubArray = countShortestSubArray(nums, k);
        int largestSubArray = countLargestSubArray(nums, k);
        System.out.println("ShortestSubArray:" + shortestSubArray);
        System.out.println("LargestSubArray:" + largestSubArray);
    }

    /**
     * This method counts the number of largest subarrays with a given sum.
     * 
     * @param nums        the input array
     * @param targetValue the target sum
     * @return the count of largest subarrays with the target sum
     */
    private static int countLargestSubArray(int[] nums, int targetValue) {
        int count = 0, maxLength = Integer.MIN_VALUE;
        int n = nums.length;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                int length = (j - i) + 1;

                // Check if the current subarray has the target sum
                if (sum == targetValue) {
                    // Update the maximum length and count if necessary
                    if (length > maxLength) {
                        maxLength = length;
                        count = 1;
                    } else if (length == maxLength) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * This method counts the number of shortest subarrays with a given sum.
     * 
     * @param nums        the input array
     * @param targetValue the target sum
     * @return the count of shortest subarrays with the target sum
     */
    private static int countShortestSubArray(int[] nums, int targetValue) {
        int count = 0, minLength = Integer.MAX_VALUE;
        int n = nums.length;

        // Iterate over all possible subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                int length = (j - i) + 1;

                // Check if the current subarray has the target sum
                if (sum == targetValue) {
                    // Update the minimum length and count if necessary
                    if (length < minLength) {
                        minLength = length;
                        count = 1;
                    } else if (length == minLength) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}