package practice;

public class practice16 {
	public static void main(String[] args) {
		int num = 0B000000101;
		
		System.out.println(num << 2);
		System.out.println(num >> 2);
		System.out.println(num >>> 2);
		
		System.out.println(num);
		
		num = num << 2;
		System.out.println(num);
	}

}
