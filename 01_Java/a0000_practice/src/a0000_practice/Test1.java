<<<<<<< HEAD
package a0000_practice;

public class Test1 {
	public void test() {
		practice[] ii = new practice[3]; // practice 3개짜리 배열 생성
		ii[0] = new practice("192.123.19.7", "강건강");   // practice 참조변수
		ii[1] = new practice("192.100.42.30", "남나눔");
		ii[2] = new practice("192.27.3.12", "도대담");
		
		for(int i = 0; i < ii.length; i++) { //  practice에서 비어있는 인덱스를 찾아
			  // 해당 인덱스에 매개변수를 이용해서 생성된 practice 객체 주소를 대입
			  // -> true 반환
			System.out.println("ip : " + ii[i].getIp());
		}
	}

}
=======
package a0000_practice;

public class Test1 {
	public void test() {
		practice[] ii = new practice[3]; // practice 3개짜리 배열 생성
		ii[0] = new practice("192.123.19.7", "강건강");   // practice 참조변수
		ii[1] = new practice("192.100.42.30", "남나눔");
		ii[2] = new practice("192.27.3.12", "도대담");
		
		for(int i = 0; i < ii.length; i++) { //  practice에서 비어있는 인덱스를 찾아
			  // 해당 인덱스에 매개변수를 이용해서 생성된 practice 객체 주소를 대입
			  // -> true 반환
			System.out.println("ip : " + ii[i].getIp());
		}
	}

}
>>>>>>> b501746 (1)
