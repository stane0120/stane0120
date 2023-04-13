package practice;

public class practice26 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) { // break문을 쓰는 대신 조건식 생략
			sum += num;
			if(sum >= 100)
				break;
		}  //sum이 100 이상일 때 반복문 중단
		
		System.out.println("num : " + num); // sum값이 100 이상이어서 종료될시 num 값
		System.out.println("sum : " + sum); // sum값
	}

}
