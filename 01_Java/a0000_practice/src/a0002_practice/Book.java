<<<<<<< HEAD
package a0002_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException; // 임포트 구문
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Book {
	private String title; // 직렬화 선언하는 구문
	private int price; 
	
	public Book() {}
	public Book(String title, int price) {
		this.title = title;
		this.price = price; // 필드 선언 구문
	}
	// getter / setter 구문
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override // 오버라이딩 구문
	public String toString() {
		return title + "(" + price + "원)";
	}
	


// 메서드 작성 구문
public void fileSave() {
	ObjectOutputStream objOut = null;
	try {
		objOut = new ObjectOutputStream(new FileInputStream("test.txt")); //파일 생성, 파일 출력스트림 생성
		objOut.writeObject(new Book("자바를 정복하자", 35000)); // 객체 출력스트림 생성
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) { // 객체를 출력하는 부분
		e.printStackTrace();
	} finally {
		try {
			if(objOut != null) {
				objOut.close();   // 객체 정보를 기록하고 닫는다
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}

=======
package a0002_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException; // 임포트 구문
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Book {
	private String title; // 직렬화 선언하는 구문
	private int price; 
	
	public Book() {}
	public Book(String title, int price) {
		this.title = title;
		this.price = price; // 필드 선언 구문
	}
	// getter / setter 구문
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override // 오버라이딩 구문
	public String toString() {
		return title + "(" + price + "원)";
	}
	


// 메서드 작성 구문
public void fileSave() {
	ObjectOutputStream objOut = null;
	try {
		objOut = new ObjectOutputStream(new FileInputStream("test.txt")); //파일 생성, 파일 출력스트림 생성
		objOut.writeObject(new Book("자바를 정복하자", 35000)); // 객체 출력스트림 생성
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) { // 객체를 출력하는 부분
		e.printStackTrace();
	} finally {
		try {
			if(objOut != null) {
				objOut.close();   // 객체 정보를 기록하고 닫는다
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}

>>>>>>> b501746 (1)
}