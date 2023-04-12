package practice;

public class practice24 { // 중첩 반복문
	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) { // 2단부터 9단까지 출력하는 반복문
			for(times = 1; times <= 9; times++) { // 각 단에서 1~9를 곱하는 반복문
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
	}

}
