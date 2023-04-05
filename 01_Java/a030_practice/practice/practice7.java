package practice;

public class practice7 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) { // 지정한 문장을 정해진 횟수만큼 반복해서 수행
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
	}

}
