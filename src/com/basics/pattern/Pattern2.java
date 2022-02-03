package com.basics.pattern;

import java.util.*;

public class Pattern2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 1;
		while (a <= n) {
			int i = 1;
			while (i <= a) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			a++;

		}

	}

}
