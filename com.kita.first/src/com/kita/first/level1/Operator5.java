package com.kita.first.level1;

public class Operator5 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		System.out.println(n1 == n2); // false(boolean)
		boolean result = (n1 == n2); // 괄호 없어도 상관 없ㄷr
		n2 = 3; 
		result = n1 == n2;
		System.out.println(result);
		System.out.println(!result); // ! = 부우정 (반대가 된다)
		System.out.println(!!result); // 참의 부정에 부정(고대로)
		
		result = n1 > n2;
		System.out.println(result);
		
		result = n1 < n2;
		System.out.println(result);
		
		result = n1 != n2; // 같지 않다
		System.out.println(result);
	}

}
