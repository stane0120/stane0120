package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPratice3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[실행화면]");
		
		System.out.print("정수 입력 : ");
		
		int input = sc.nextInt();
		
		String result = input > 0 ? "양수 입니다." 
			       : input == 0 ? "0 입니다. " : "음수 입니다."  ; 
	 
	
	System.out.println(result);
	
	}

}
