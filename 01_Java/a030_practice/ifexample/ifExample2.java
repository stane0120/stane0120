package ifexample;

public class ifExample2 {
	public static void main(String[] args) {
		int age = 9;  // 변수에 값 대입
		int charge;
		
		if(age < 8) {  // age가 8 미만일때 출력
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		
		else if(age < 14) { // age가 8 이상 14 미만일때 출력
			charge = 2000;
			System.out.println("초등학생입니다");
		}
		
		else if(age < 20) { // age가 14 이상 20 미만일때 출력 
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		}
		
		else {  // age가 20 이상일때 출력
			charge = 3000;
			System.out.println("일반인입니다");
		}
		System.out.println("입장료는 "+charge+"원입니다");
		
	}

}
