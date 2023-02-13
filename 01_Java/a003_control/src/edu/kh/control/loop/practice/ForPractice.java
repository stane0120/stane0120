package edu.kh.control.loop.practice;

import java.util.Scanner;

// 실습문제용 클래스
public class ForPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int input = sc.nextInt();
				
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else            	
			
			 for(int x=1 ; x<=input ; x++) {
				 
			 }
            	for(int i=1 ; i<=input ; i++) {
            		System.out.print(i + " ");
            	}
            }    
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요: ");
		int input = sc.nextInt();
				
		if(input < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else            	
			
			 for(int x=input ; x>=1 ; x--) {
				 
			 }
            	for(int i=input ; i>=1 ; i--) {
            		System.out.print(i + " ");
            		
            	}
            }    
            
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int input = sc.nextInt();
				
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum += i;
            System.out.print(i);
                                 
            if(i != input) {
            	System.out.print(" + ");
            }
       	}
		
		System.out.println(" = " + sum);
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
	System.out.print("첫 번째 숫자: ");
	int num1 = sc.nextInt(); 
	
	System.out.print("두 번째 숫자: ");
	int num2 = sc.nextInt();
	
	if(num1<1 || num2<1) {
		System.out.println("1 이상의 숫자를 입력해주세요.");
	} else {
    for(int i = num1;  i <= num2 ; i++) {
    	   
    System.out.print(i + " ");
    
    }
    System.out.println();
    }
	}
	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
	System.out.print("숫자 : ");
	int input1 = sc.nextInt(); 
	
    
	
	for(int i = 1 ; i <= 9 ; i++)

	System.out.printf("%d x %d =  %2d \n", input1, i, input1*i );

}
	
	public void practice6() {
  	Scanner sc = new Scanner(System.in);
	System.out.print("숫자 : ");
    int input1 = sc.nextInt();
    
    if(input1 < 2 || input1 > 9) { 
    		System.out.println("2~9 사이 숫자만 입력해주세요.");
    } else {
    	
    	for(int dan=2 ; dan<=9 ; dan++) {
    		
    		for(int num=1 ; num<=9 ; num++) {
    			System.out.printf("%dx%d=%d \n", dan, num, dan*num);
    		}
    		
    		System.out.println(); // 개행
    		
    	}
    }
    	
    }
	public void practice7() {
	  	Scanner sc = new Scanner(System.in);
    	System.out.println("정수 입력 : ");
    	int input = sc.nextInt();
    	
     	for(int x=4 ; x>=1 ; x--) { // 4번 반복 (x=1,2,3,4)
    		
        	for(int i=4 ; i>=x ; i--) { // 한 줄 출력
        		System.out.print(i);
        		
        	}
        	
        	System.out.println(); // 개행
           
        }
    }
	
	public void practice8() {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int input = sc.nextInt();
	
    for(int row=input ; row>=1 ; row--) { // x=1,2,3
    	
    	for(int col=row ; col>=1 ; col--) {
    		System.out.print("*");
    	}   	
       System.out.println(); // 개행
    }
}
	
	public void practice11() {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력 : ");
	int input = sc.nextInt();

	
	for(int row=1 ; row<=input ; row++) {
		
		for(int col=input-row ; col>=1 ; col--) {
			System.out.print(" ");
		}
		
		for(int col=1 ; col<=row * 2 -1; col++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	}
	
	
	
	
	
	
	public void practice12() {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int input = sc.nextInt();
	
	
	for(int row=1 ; row<=input ; row++) {
		
		for(int col=1; col<=input ; col++) {
			
			
 	if(row==1 || row==input || col==1 || col==input) {
			System.out.print("*");
		}else {
	        System.out.print(" ");
		} 
	
	    System.out.println(); //개행
	
	}
	}
}
}


	




