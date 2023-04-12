package practice;

public class practice21 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;            // 조건식이 참이 아니더라도 무조건 한번 수행하고 조건식에 가서 검사함
		} while (num <= 50); // 조건식
		
		System.out.println("1부터 50까지의 합은 " + sum + "입니다");
	}

}
