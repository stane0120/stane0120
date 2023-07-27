package finalex;

public class Constant {
	int num = 10;
	int NUM = 100; // 상수 선언
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
		cons.NUM = 200; // 값을 대입
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}

}
