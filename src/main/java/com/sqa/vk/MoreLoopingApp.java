package com.sqa.vk;

public class MoreLoopingApp {

	public static void main(String[] args) {
		fourOutputs();
		twoLoops();
		threeLoops();
	}

	private static void fourOutputs() {
		for (int i = 10; i >= 5; i--) {
			System.out.print(i);
			if (i > 5) {
				System.out.print(",");
			}
		}
		System.out.println();
		for (int i = 0; i <= 5; i++) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		for (int i = 1000; i >= 8; i /= 5) {
			System.out.print(i);
			if (i > 8) {
				System.out.print("<<<");
			}
		}
		System.out.println("\n");
	}

	private static void threeLoops() {
		for (int i = 6; i > 0; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int k = 6 - i; k >= 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void twoLoops() {
		for (int i = 6; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
