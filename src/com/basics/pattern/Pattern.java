package com.basics.pattern;

import java.util.*;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int i = p;
		int row = 1;
		while (row <= i) {
			int s = 1;
			while (s <= i) {
				System.out.print("* ");
				s++;
			}
			System.out.println();
			row += 1;
		}

	}

}
