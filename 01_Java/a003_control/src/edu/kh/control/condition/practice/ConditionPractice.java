package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 한 개 입력하세요: ");
		int input = sc.nextInt();
		
		if(input <= 0) { // 3
			System.out.println("양수만 입력해주세요.");
			
	} else if(input > 0 && input % 2 == 0) {
			System.out.println("짝수 입니다.");		
			
	}  else {
		System.out.println("홀수 입니다.");

}

}
	
}
  
	public void practice2() {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("[실행화면 1]");
		
		System.out.println("국어점수 : ");
		int input1 = sc.nextInt();
		
		System.out.println("수학점수 : ");
		int input2 = sc.nextInt();
		
		System.out.println("영어점수 : ");
		int input3 = sc.nextInt();
	    
	int num = input1+input2+input3
	int avg = (input1+input2+input3)/3;
	
	String result;
		
		if(input1 >= 40 && input2 >= 40 && input3 >= 40 && avg >= 60) { 
			result = 
		
		}

