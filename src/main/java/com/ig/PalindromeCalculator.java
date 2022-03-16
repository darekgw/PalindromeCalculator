package com.ig;

import java.math.BigInteger;

public class PalindromeCalculator {

	protected void calculatePalindrome(BigInteger number, int countNumberOfAddition) {
		BigInteger reversedNumber = reverseNumber(number);
		BigInteger sum = number.add(reversedNumber);
		BigInteger reversedSum = reverseNumber(sum);
		if(countNumberOfAddition > 999) {
			System.out.println("Not possible to count palindrome in " + countNumberOfAddition + " iteration.");
		} else if(sum.compareTo(reversedSum) !=0) {
			int countIterations = countNumberOfAddition + 1;
			calculatePalindrome(sum, countIterations);
		} else {
			System.out.println(countNumberOfAddition + " " + sum);
		}
	}

	private BigInteger reverseNumber(BigInteger number) {
		String numberToString = number.toString();
		String reversedNumberToString = new StringBuilder(numberToString).reverse().toString();
		return new BigInteger(reversedNumberToString);
	}

}
