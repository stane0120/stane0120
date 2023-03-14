package a0001_practice;

import java.util.ArrayList;

public class MyCollectionPractice {
	public void test() {
		ArrayList<Test>  list = new ArrayList<Test>();
		list.add(new Test("자바", 93.5));
		list.add(new Test("디비", 74.1));
		list.add(new Test("서버", 82,7));
		
		for(int i = 0; i < list.size(); i++) { 
			System.out.println(list.get(i));
			
		}
		
	}

}

