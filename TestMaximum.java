package com.assignment13.bridglabz;
//Refractor2
public class GenericMaximum<T extends Comparable<T>> {
	T x, y, z;
	T max;

	GenericMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public void testMax() {
		testMax(x, y, z);
	}

	static <T extends Comparable<T>> T testMax(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	public static void main(String args[]) {
		
	System.out.println("Welcome to Generics Maximum Program");
	System.out.println("Maximum of Integers Numbers");
	System.out.println("Test case1\n Maximum of Numbers : 1 ,2 ,3  ");
	System.out.println(testMax(1, 2, 3));
	System.out.println("Test case2\n Maximum of Numbers : 5 ,9 ,3  ");
	System.out.println(testMax(5, 9, 3));
	System.out.println("Test case3\n Maximum of Numbers : 1 ,2 ,7  ");
	System.out.println(testMax(1, 2, 7));
	
	System.out.println("Maximum of Float Numbers");
	System.out.println("Test case1\n Maximum of Numbers : 4.1F, 2.4F, 3.8F ");
	System.out.println(testMax(4.1F, 2.4F, 3.8F));
	System.out.println("Test case2\n Maximum of Numbers : 3.2F, 3.7F, 3.6F ");
	System.out.println(testMax(3.2F, 3.7F, 3.6F));
	System.out.println("Test case3\n Maximum of Numbers :1.2F,1.32F,1.77F ");
	System.out.println(testMax( 1.2F,1.32F,1.77F));
	
	System.out.println("Maximum of Strings");
	System.out.println("Test case1\n Maximum of Strings : Peach, Apple, Banana");
	System.out.println(testMax("Peach","Apple","Banana"));
	System.out.println("Test case2\n Maximum of Strings : Apple, Orange, Banana ");
	System.out.println(testMax("Apple","Orange","Banana"));
	System.out.println("Test case3\n Maximum of Strings : Apple, Banana, Strawberry ");
	System.out.println(testMax("Apple","Banana","Strawberry"));
	}
}