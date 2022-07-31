package com.assignment13.bridglabz;

public class Uc5<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T testMax(T... value) {
		T max = value[0]; // assume a is initially the largest

		for (int i = 1; i < value.length; i++) {
			if (value[i].compareTo(max) > 0) {
				max = value[i];
			}
		}
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		printMax(max);
		return max;
	}

	public static <T> void printMax(T max) {
		System.out.println("\nMaximum Value is= " + max + "\n");
	}

	public static void main(String args[]) {

		System.out.println("Welcome to Generics Maximum Program");
		System.out.println("\nMaximum of Integers Numbers");
		System.out.println(testMax(1, 2, 3));
		System.out.println(testMax(1, 2, 7,9,8));

		System.out.println("\nMaximum of Float Numbers");
		System.out.println(testMax(3.2F, 4.8F, 3.7F, 3.6F));
		System.out.println(testMax(1.2F, 1.32F, 1.77F, 2.7F, 0.3F));

		System.out.println("\nMaximum of Strings");
		System.out.println(testMax("Apple", "Orange", "Banana", "WaterMelon", "Lemon"));
		System.out.println(testMax("Apple",  "Banana", "WaterMelon", "Lemon"));

	}
}