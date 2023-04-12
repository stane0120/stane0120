package practice;

public class practice18 {
public static void main(String[] args) {
	
	int age = 9;   // 변수값 설정
	int charge;    // 변수인 요금 설정
	
	if(age < 8) {  // 조건문
		charge = 1000;
		System.out.println("미취학 아동");
	}
	else if(age < 14) {
		charge = 2000;
		System.out.println("초등학생");
	}
	else if(age < 20) {
		charge = 2500;
		System.out.println("중고생");
	}
	else if(age < 60){
		charge = 3000;
		System.out.println("일반인입니다");
	}
	else {
		charge = 0;
		System.out.println("경로우대입니다");
	}
	System.out.println("입장료는" + charge + "원입니다"); // 조건에 맞는 charge값과 함께 출력
}
}
