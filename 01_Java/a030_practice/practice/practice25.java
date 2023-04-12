package practice;

public class practice25 {
	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num = 1; num <=100; num++) { // 100까지 반복하는 반복문
			if(num % 2 == 0)             // num이 짝수인 경우
				continue;                // 이후 수행을 생략하고 num++을 수행
			total += num;                // num 값이 홀수일때만 수행
		}
		System.out.println("1부터 100까지 홀수의 합은: " + total + "입니다");
	}

}
