package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * This class provides methods to find the count of shortest and largest subarrays 
 * with a given sum in a provided array.
 */
public class Session8Improvised {

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

        // Print the results
        System.out.println("Min Length: " + shortestSubArray + " Count: " + countShortestSubArray(nums, k));
        System.out.println("Max Length: " + largestSubArray + " Count: " + countLargestSubArray(nums, k));
    }

    /**
     * This method counts the number of shortest subarrays with a given sum.
     * 
     * @param arr        the input array
     * @param targetValue the target sum
     * @return the count of shortest subarrays with the target sum
     */
    private static int countShortestSubArray(int[] arr, int k) {
        int count = 0, pSum = 0, n = arr.length, minLength = Integer.MAX_VALUE;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();

        // Iterate over the array and calculate the prefix sum
        for (int j = 0; j < n; j++) {
            pSum = pSum + arr[j];

            // Check if the prefix sum minus the target value exists in the map
            int x = pSum - k;
            System.out.println("Checking if we have " + x + " in map | pSum:" + pSum);

            // If it exists, update the minimum length and count if necessary
            if (sumIndexMap.containsKey(x)) {
                int currentLength = j - sumIndexMap.get(pSum - k);
                if (currentLength < minLength) {
                    minLength = currentLength;
                    count = 1;
                } else if (currentLength == minLength) {
                    count++;
                }
            }

            // Add the prefix sum to the map if it doesn't exist
            sumIndexMap.putIfAbsent(pSum, j);
        }

        // Print the minimum length and count
        System.out.println("Min Length: " + minLength + " Count: " + count);
        return minLength;
    }

    /**
     * This method counts the number of largest subarrays with a given sum.
     * 
     * @param arr        the input array
     * @param targetValue the target sum
     * @return the count of largest subarrays with the target sum
     */
    private static int countLargestSubArray(int[] arr, int k) {
        int count = 0, maxLength = 0, n = arr.length, pSum = 0;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();

        // Iterate over the array and calculate the prefix sum
        for (int i = 0; i < n; i++) {
            pSum = pSum + arr[i];

            // Check if the prefix sum minus the target value exists in the map
            if (sumIndexMap.containsKey(pSum - k)) {
                int currLength = i - sumIndexMap.get(pSum - k);

                // Update the maximum length and count if necessary
                if (currLength > maxLength) {
                    maxLength = currLength;
                    count = 1;
                } else if (currLength == maxLength) {
                    count++;
                }
            }

            // Add the prefix sum to the map if it doesn't exist
            sumIndexMap.putIfAbsent(pSum, i);
        }

        // Print the maximum length and count
        System.out.println("Max Length: " + maxLength + " Count: " + count);
        return maxLength;
    }
}