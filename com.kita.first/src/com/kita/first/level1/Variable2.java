package com.kita.first.level1;

public class Variable2 {
	public static void main(String[] args) {
		int v1 = 500_000_000; // '_'는 영향 X
		System.out.println(v1);
		long v2 = 12345656464654l;
		float v3 = 1225.232f;
		
		String v4 = "문자열"; // 참조형 변수, ""안에 값
		v1 = (int)v3;
		System.out.println();
		System.out.println(1+"2"+3+4);
		
		String s1 = "123";
		int n4 = Integer.parseInt(s1);
		double n6 = Double.parseDouble(s1);
		
		int n5 = 5;
		System.out.println(n4 + n5);
	}
}