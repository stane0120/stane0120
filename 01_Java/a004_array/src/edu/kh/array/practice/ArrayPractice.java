package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {
	
	public void ex1() {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0 ; i<arr.length ; i++) {
									
			  System.out.print(" " + arr[i]);
			  		  
		}
        	System.out.println(); 

        	} 
	
	public void ex2() {
		
		int[] arr = {9,8,7,6,5,4,3,2,1};
		
		for(int i=0 ; i<arr.length ; i++) {
			
			  System.out.print(" " + arr[i]);
			  		  
		}
      	System.out.println(); 
			
	}
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		
		int[] arr;
		
		arr = new int[input];
		
			
			for(int i=0 ; i<arr.length; i++) {
				
				arr[i] = i * 10 + 1;
			
			System.out.print(input + " ");
		}
		
		
		
	}
	
}
		


