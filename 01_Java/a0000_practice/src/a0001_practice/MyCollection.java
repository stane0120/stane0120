<<<<<<< HEAD
package a0001_practice;

import java.util.ArrayList; // 배열을 임포트하는 구문

public class MyCollection {
	
	public void test() {
		ArrayList<Test>  list = new ArrayList<Test>(); // 배열 생성
		list.add(new Test("자바", 93.5)); // Test 객체
		list.add(new Test("디비", 74.1));
		list.add(new Test("서버", 82,7));
		
		for(int i = 0; i < list.size(); i++) { // 매개변수를 이용하여 생성된 Test 주소를 대입
			System.out.println(list.get(i));
			
		}
		
	}

}
=======
package a0001_practice;

import java.util.ArrayList; // 배열을 임포트하는 구문

public class MyCollection {
	
	public void test() {
		ArrayList<Test>  list = new ArrayList<Test>(); // 배열 생성
		list.add(new Test("자바", 93.5)); // Test 객체
		list.add(new Test("디비", 74.1));
		list.add(new Test("서버", 82,7));
		
		for(int i = 0; i < list.size(); i++) { // 매개변수를 이용하여 생성된 Test 주소를 대입
			System.out.println(list.get(i));
			
		}
		
	}

}
>>>>>>> b501746 (1)
