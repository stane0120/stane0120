package practice;

public class practice23 {
 public static void main(String[] args) {
	int i;
	int sum;
	for(i = 1, sum = 0; i <= 10; i++) { // 두개의 변수를 모두 초기화
		sum += i;
	}
	
	System.out.println("1부터 10까지의 합은 " + sum + "입니다");
}
}
