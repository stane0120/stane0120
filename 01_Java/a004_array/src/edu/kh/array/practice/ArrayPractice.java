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
			
				System.out.printf("%2d", i+1);
		}
	}

				
	
			

	
				
			public void ex6() {	
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수 : ");
				int size = sc.nextInt();
				
				int[] arr = new int[size];
					
				
				for(int i=0 ; i<arr.length ; i++) {	
			    	System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i); 
			    	arr[i] = sc.nextInt();
			    
			    	
			    	}
				
				System.out.print("");
				
				int sum = 0;
				for(int i=0 ; i<arr.length ; i++) {				    	
			    	System.out.print(arr[i] + " ");

			    	sum += arr[i];
			    
					
				}
				 System.out.println();
				 System.out.printf("총 합 : %d", sum);
			    			
			   	}			
				  
			
				
				
			
			
			
				
			
			public void ex7() {	
			
				Scanner sc = new Scanner(System.in);
				System.out.print("주민등록번호(-포함) : ");
				char size = sc.next().charAt(0);
				
				char[] scoreArr = new char[size];
				
              

	            	
			     }
			
			
			
			
			
			
			
			public void ex9() {
				
			int[] arr = new int[10];
			
			// 난수 대입 및 출력
			for(int row=0 ; row<arr.length ; row++) {
				

					
					arr[row]= (int)(Math.random() * 10+1); // 0 ~ 9
				
				    System.out.printf("%3d",arr[row]);
				}
				
				System.out.println(); 
				
			}


			
			
			
			public void ex10() {
				
				int[] arr = new int[10];
				
				// 난수 대입 및 출력
				System.out.print("발생한 난수 : ");
				for(int row=0 ; row<arr.length ; row++) {
											
						arr[row]= (int)(Math.random() * 10+1); // 0 ~ 9
					
					    System.out.print(arr[row]+" ");
					}
					
					System.out.println(); 
					
					int max = arr[0];
					int min = arr[0];
					
					int maxIndex = 0;
					int minIndex = 0;
					
					
					for(int i=0 ; i<arr.length ; i++) {
						if(arr[i] > max) {
			            	max = arr[i];
			            	maxIndex = i;
			            	
						}
						 if(arr[i] < min) {
			            	min = arr[i];
		                	minIndex = i;
			            }
							
			            if(arr[i] < min) {
			            	min = arr[i];
			            }
			                     
						}
						
					System.out.printf("최대값 : %d  \n", max, maxIndex + 1);
					System.out.printf("최소값 : %d  \n", min, minIndex + 1);
						
					}
					

			
			
			
			
			

			public void ex15() {
			int[][] arr = new int[3][3];
			
			// 난수 대입 및 출력
			for(int row=0 ; row<arr.length ; row++) {
				
				for(int col=0; col<arr[row].length ; col++ ) {

					arr[row][col] = (int)(Math.random() * 10); // 0 ~ 9					
				    System.out.printf("%3d", arr[row][col]);
				}
				
				System.out.println();
			}
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
	            int number = 16;
	        
	        for(int row=0 ; row<arr.length ; row++) { // 행 반복        	
	        	for(int col=0 ; col<arr[0].length ; col++) { // 열 반복
	        		
	        		arr[row][col] = (number) ;
	        		arr[row][col] = (number) ;
	        		
	        		number--;
	        		
	        		System.out.print(arr[row][col] + " ");       		
	        	}             	   
	           System.out.println();
}
	        
	        
	        
	        
	        
	        
			}
			public void ex18() {	
			
				int[][] arr = new int[4][4];
			for(int row=0 ; row<arr.length ; row++) {
				
				for(int col=0; col<arr[row].length ; col++ ) {
					
					// 배열 요소에 난수 대입
					arr[row][col] = (int)(Math.random() * 10); // 0 ~ 9
				
					
					
				    System.out.printf("%3d", arr[row][col]);
				    
				    
				}
				
				System.out.println(); // 개행
			}
			
}
			
			
			
			
}
			

		
		
		
	
	

		


