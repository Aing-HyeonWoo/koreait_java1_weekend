package com.kita.first.level1;

public class Operator6 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		int n3 = 3;
		
		boolean result;
		result = (n1 == n2 && n2 == n3 && n1 == n3); // 모두 참이여야 참 
		System.out.println(result);
		result = (n1 == n2 || n2 == n3 || n1 == n3); // 하나라도 참이 있으면 참
		System.out.println(result);
	}
}
