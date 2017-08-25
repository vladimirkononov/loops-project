/**
 * File Name: LoopsApp.java<br>
 * Kononov, Vladimir<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aug 24, 2017
 */
package com.sqa.vk;

import com.sqa.vk.helpers.*;

/**
 * NewBasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 */
public class LoopsApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppBasics.greetUserAndGetName("Loops App");
		// countNumbers();
		// sortingNumbers();
		gradeAverage();
	}

	private static void countNumbers() {
		System.out.println("\nCount 100 - 200 numbers.\n");
		int count = 0;
		for (count = 0; count <= 100; count++) {
			System.out.print(count);
			if (count < 100) {
				System.out.print(", ");
			}
		}
		System.out.println("\n----------------\n");
		System.out.println("Count 200 - 100 numbers.\n");
		for (count = 200; count >= 100; count--) {
			System.out.print(count);
			if (count > 100) {
				System.out.print(", ");
			}
		}
		System.out.println("\n----------------\n");
		System.out.println("Count 10 - 1000 numbers.\n");
		for (count = 10; count <= 1000; count += 10) {
			System.out.print(count);
			if (count < 1000) {
				System.out.print(", ");
			}
		}
	}

	/**
	 * Write a method which prints the grade average for a user based on a user
	 * supplied set of grade values. Repeat execution until user has no more
	 * items to be graded. Use a do while for this exercise. You will also have
	 * to use two variables to hold the current accumulated grade points as well
	 * as the total number of grades entered so that the average will be
	 * totalGradePoints / numTotalGrades. Other things covered in this exercise:
	 * Scanner, Integer.parseInt.
	 */
	private static void gradeAverage() {
		int totalNumGrades = AppBasics.requestInt("How many grades would you like to be calculated?", 1, 10,
				"You must enter a valid number of grades to be calculated withing the range of 1 - 10.");
		double totalPoints = 0;
		int i = 1;
		do {
			totalPoints = totalPoints + AppBasics.requestDouble("Can i get your grade entry # " + i);
			i++;
		} while (i <= totalNumGrades);
		System.out.printf("Your total grade for this course is " + totalPoints / totalNumGrades);
	}

	private static void sortingNumbers() {
		System.out.println("\n-------------\n");
		System.out.println("Print even numbers from 1 to 100.\n");
		int count = 1;
		while (count <= 100) {
			if (count % 2 == 0) {
				System.out.print(count);
				if (count < 100) {
					System.out.print(", ");
				}
			}
			count++;
		}
		System.out.println("\n-------------\n");
		System.out.println("Print odd numbers between 300 and 400.\n");
		count = 300;
		while (count <= 400) {
			if (count % 2 != 0) {
				System.out.print(count);
				if (count < 400) {
					System.out.print(", ");
				}
			}
			count++;
		}
		System.out.println("\n-------------\n");
		System.out.println("Print 30 - 333 numbers evenly devided by 3.\n");
		count = 30;
		while (count <= 333) {
			if (count % 3 == 0) {
				System.out.print(count);
				if (count < 333) {
					System.out.print(", ");
				}
			}
			count++;
		}
	}
}
