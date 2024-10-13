package com.prerequisite.hashing;

import java.util.Scanner;

public class Hashing1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		//O(q*n) solution ==> O(N^2)
		for(int i=0;i<q;i++) {
			int query = sc.nextInt();
			int freq=0;
			for(int j=0;j<n;j++) {
				if(array[j]==query) {
					freq++;
				}
			}
			System.out.println("frequencey of "+query+" is "+freq);
		}
		sc.close();

	}

}
