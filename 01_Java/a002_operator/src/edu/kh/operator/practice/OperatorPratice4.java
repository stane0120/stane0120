package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPratice4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 과목에 대한 합계와 평균");
		
		System.out.print("국어 : ");
		int input1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int input2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int input3 = sc.nextInt();
		
		System.out.printf("합계 : %d \n", input1+input2+input3);
		System.out.printf("평균 : %d \n", (input1+input2+input3)/3);
		String result = input1 >= 40? input2 >= 40? input3 >= 40? (input1+input2+input3)/3? " 합격. " 
				               : " 불합격. " ;
		
		System.out.println(result);
	}

}
