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
		// TODO Auto-generated method stub
	}

	private static void twoLoops() {
		for (int j = 0; j < 6; j++) {
			System.out.println();
			for (int i = 6; i > 0; i--) {
				System.out.print("*");
			}
		}
	}
}
