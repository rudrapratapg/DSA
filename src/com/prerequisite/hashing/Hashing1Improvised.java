package com.prerequisite.hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing1Improvised {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of array : ");
		int n = sc.nextInt();
		int[] array = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		System.out.println("\nEnter all the elements for array one by one and hit enter everytime: ");
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			array[i] = num;
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		System.out.println("\nHow many queries you want to make?");
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			System.out.print("Enter query : ");
			int query = sc.nextInt();
			System.out.println("Frequency of "+query+" is "+map.getOrDefault(query, 0));
		}

	}

}
