package practice;

public class practice14 {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10); // &&는 두 항이 모두 참일때만 실행되는데 앞 항의 결과 값이 거짓이므로 실행되지 않는다
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // ||는 하나의 항만 참이면 실행된다, 이 항은 앞의 항이 참이어서 뒤의 항이 실행되지 않았다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
