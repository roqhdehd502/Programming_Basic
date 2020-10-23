package com.bitcamp.java;

public class Jogun {

	public static void main(String[] args) {
		//forOne();
		forTwo();
	}
	/*
	private static void forOne() {
		for(int i=0; i<=10; i++) {
			System.out.println(i + "번째 출력");
		}
	}
	*/
	private static void forTwo() {
		/*
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " + " + j + " = " + i*j);
			}
		}
		*/
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + " + " + j + " = " + i*j + " ");
				if((i*j) <=9) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
