package com.kita.first.level1;

public class Variable3 {
	public static void main(String[] args) {
		// int < long < float < double < string
		int v1 = 3;
		int v2 = 5;
		System.out.println(v1 + v2);
		
		int result = v1 + v2;
		System.out.println(result);
		
		double v3 = 2.4;
		double result2 = v1 + (int)v3;
		System.out.println(result2);
		
		long v4 = 12l;
		double result3 = v4;
		float result4 = v4;
		
		System.out.println("안녕" + "하이");
		
		System.out.println(1 + 2 + 3);
		System.out.println(1 + 2 + "3");
		System.out.println(1 + "2" + 3);
		
		String s1 = "123";
		int n4 = Integer.parseInt(s1);

	}
}