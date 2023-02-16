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
	
			public void ex4() {
				
				int[] arr;
				Scanner sc = new Scanner(System.in);
				int[] input = new int[5];
				for(int i=0 ; i<input.length ; i++) {
					System.out.printf("입력 %d : ", i+1);
					
					input[i] = sc.nextInt();
					
					}

				

			}
		
			public void ex5() {	
				
				
			}
	
				
			public void ex6() {	
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수 : ");
				int size = sc.nextInt();
				
				int[] scoreArr = new int[size];
				
				int sum = 0;
				for(int i=0 ; i<scoreArr.length ; i++) {	
			    	System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i); // 1 2 3
			    	scoreArr[i] = sc.nextInt();
			    	sum += scoreArr[i];
			    			
			   	}				    
					System.out.printf("총 합 : " + sum);
			}
				
				
			
				
			
			public void ex7() {	
			
				Scanner sc = new Scanner(System.in);
				System.out.print("주민등록번호(-포함) : ");
				char size = sc.next().charAt(0);
				
				char[] scoreArr = new char[size];
				
				if(size > 8) {
					System.out.printf("*" + scoreArr);
				} else {
					System.out.printf(" " + scoreArr);
				}
				
				System.out.println(" " + size);
			}
			public void ex8() {
				
				
			}

			public void ex9() {	
				
				int[] arr;
				arr = new int[10];
				
				for(int i=0 ; i<arr.length ; i++) {
					arr[i] = (int)(Math.random() * arr.length);
				}
								
				System.out.println("발생한 난수 : " + arr);
				
			}
			
			public void ex10() {
				
			
			int[] arr;
			arr = new int[10];
			
			for(int i=0 ; i<10 ; i++) {
				arr[i] = (int)(Math.random() * arr.length);
			}
							
			System.out.println("발생한 난수 : " + arr);
			}

			
			public void ex16() {
				int[][] arr = new int[4][4];
		        int number = 1;
		        
		        for(int row=0 ; row<arr.length ; row++) { // 행 반복        	
		        	for(int col=0 ; col<arr[0].length ; col++) { // 열 반복
		        		
		        		arr[row][col] = (number) ;
		        		arr[row][col] = (number) ;
		        		
		        		number++;
		        		
		        		System.out.print(arr[row][col] + " ");       		
		        	}             	   
		           System.out.println();
			}
			
				}
			
			public void ex17() {				
				int[][] arr = new int[4][4];
	            int number = 17;
	        
	        for(int row=0 ; row>arr.length ; row--) { // 행 반복        	
	        	for(int col=0 ; col>arr[0].length ; col--) { // 열 반복
	        		
	        		arr[row][col] = (number) ;
	        		arr[row][col] = (number) ;
	        		
	        		number++;
	        		
	        		System.out.print(arr[row][col] + " ");       		
	        	}             	   
	           System.out.println();
}
			}
}
			

		
		
		
	
	

		


