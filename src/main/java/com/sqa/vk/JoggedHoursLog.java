/**
 *
 */
package com.sqa.vk;

import com.sqa.vk.helpers.*;

/**
 * @author Vladimir
 */
public class JoggedHoursLog {

	public static void main(String[] args) {
		// String name = AppBasics.greetUserAndGetName("\"Jogged Hours
		// Tracking\" ");
		// joggedHoursLog();
		joggerLogger();
		// AppBasics.farewellUser(name);
	}

	private static void joggedHoursLog() {
		int days = AppBasics.requestInt("How many days you've jogged this week? ", 1, 7,
				" You must enter the number from 1 - 7.");
		double hours = 0;
		double total = 0;
		double average = 0;
		for (int i = 1; i <= days; i++) {
			hours = AppBasics.requestDouble("How many hours you have jogged on day " + i + "?");
			total = total + hours;
			average = total / days;
		}
		System.out.println("\nYou have jogged " + total + " hours this week");
		System.out.println("\nThe average hours you jogged during this week is " + average);
		if (total <= 15) {
			System.out.println("\nYour professional level is Amateur Jogger.\n");
		}
		if (total > 15 && total <= 40) {
			System.out.println("\nYour professional level is Efficient Jogger.\n");
		}
		if (total > 40) {
			System.out.println("\nYour professional level is Extremist Jogger.\n");
		}
	}

	private static void joggerLogger() {
		String compare = "yes";
		String name = null;
		boolean proceed = false;
		while (proceed = true) {
			String answer = AppBasics
					.requestString("Would you like to log jogger information? You must type \"Yes\" or \"No\"");
			if (answer.equalsIgnoreCase(compare)) {
				// System.out.println();
				name = AppBasics.greetUserAndGetName("\"Jogger Logger\"");
				System.out.println();
				joggedHoursLog();
			} else {
				AppBasics.farewellUser(name);
				return;
			}
		}
	}
}
