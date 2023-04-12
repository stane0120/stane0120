package practice;

public class practice20 {
	public static void main(String[] args) {
		int num = 1;  // 각 요소의 값
		int sum = 0;
		
		while(num <= 10) {  // num 값이 10보다 작거나 같을 동안
			sum += num;     // 합계인 sum에 num을 더하고
			num++;          // num에 1씩 더한다.
		}

		System.out.println("1부터 10까지의 합은 " + sum + " 입니다"); // 출력문
	}

}
