package com.rm.test;

public class SmallestGreatest {

	public static void main(String[] args) {

		int N = 93337799;
		int n1 = getMultipliedSingleDigit(N);
		int n2 = getAddedSingleDigit(N);
		int smallestGreatestNum = -1;

		
		for (int i = N + 1; i < 1000000000; i++) {
			int multipliedSingleDigit = getMultipliedSingleDigit(i);
			int addedSingleDigit = getAddedSingleDigit(i);
			if (multipliedSingleDigit < n1 && addedSingleDigit < n2) {
				smallestGreatestNum = i;
				break;
			}
		}
		System.out.println("Next smallest Greatest  number is "
				+ smallestGreatestNum);
	}

	private static int getAddedSingleDigit(int n2) {
		int noOfSteps = 0;
		while (n2 > 9) {
			n2 = addDigits(n2);
			noOfSteps++;
		}
		return noOfSteps;
	}

	private static int getMultipliedSingleDigit(int n1) {
		int noOfSteps = 0;
		while (n1 > 9) {
			n1 = multiplyDigits(n1);
			noOfSteps++;
		}
		return noOfSteps;
	}

	private static int addDigits(int copyN) {
		int sum = 0;
		while (copyN > 0) {
			int digit = copyN % 10;
			sum += digit;
			copyN /= 10;
		}
		return sum;
	}

	private static int multiplyDigits(int copyN) {
		int product = 1;
		while (copyN > 0) {
			int digit = copyN % 10;
			product *= digit;
			copyN /= 10;
		}
		return product;
	}
}
