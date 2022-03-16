package com.ig;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		PalindromeCalculator palindromeCalculator = new PalindromeCalculator();
		final BigInteger maxAcceptedValue = new BigInteger("4294967294");

		Scanner sc = new Scanner (System.in);

		System.out.println("Please, insert number to calculate palindrome or 'exit' to quit");

		while (sc.hasNext()) {
			String userInput = sc.next();
			if(userInput.equals("exit")) {
				break;
			}

			try {
				BigInteger inputNumber = new BigInteger(userInput);
				if(inputNumber.compareTo(BigInteger.ZERO) == -1) {
					System.out.println("Negative numbers are non-palindromic because minus sign on the front. Please, insert positive number or zero");
				} else if(inputNumber.compareTo(maxAcceptedValue) == 1) {
					System.out.println("The number is too big. Please, insert number not bigger then 4294967294");
				} else {
					int countNumberOfAddition = 1;
					palindromeCalculator.calculatePalindrome(inputNumber, countNumberOfAddition);
				}
			} catch (Exception e) {
				System.out.println("It is not a number. Please, insert a number.");
			}

		}
    }

}
