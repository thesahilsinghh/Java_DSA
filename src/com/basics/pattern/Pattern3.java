package com.basics.pattern;

import java.util.*;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		//a = star
		int a=n;
		while(a>=1) {
			int i =1;
			while(i<=a) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			a--;
		}
		
		
		
		
	}

}
