package com.assignment13.bridglabz;

public class FloatMaximum {

	public Float maxFloat(Float x, Float y, Float z) {

		Float max = x;

		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Generics Maximum Program");
		FloatMaximum obj = new FloatMaximum();
		
		System.out.println("Test case1\n Maximum of 4.1F, 2.4F, 3.8F: ");
		System.out.println(obj.maxFloat(4.1F, 2.4F, 3.8F));
		
		System.out.println("Test case2\n Maximum of 3.2F, 3.7F, 3.6F : ");
		System.out.println(obj.maxFloat(3.2F, 3.7F, 3.6F));
		
		System.out.println("Test case3\n Maximum of 1.2F,1.32F,1.77F : ");
		System.out.println(obj.maxFloat(1.2F,1.32F,1.77F));

	}
}
