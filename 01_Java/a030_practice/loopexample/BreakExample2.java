package loopexample;

public class BreakExample2 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {  // num이 0부터 1씩 증가함
			sum += num;     // sum은 num의 합
			if(sum >= 100) // sum이 100 이상이 되면
				break;  // 멈춤
		}
		System.out.println("num : " + num); // 멈췄을 때 num의 값
		System.out.println("sum : " + sum); // 멈췄을 때 sum의 값
	}

}
