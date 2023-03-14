package a0002_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookPractice {

		private String title;
		private int price; 
		
		public BookPractice() {}
		public BookPractice(String title, int price) {
			this.title = title;
			this.price = price; 
		}
		
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
		
		@Override 
		public String toString() {
			return title + "(" + price + "원)";
		}
		
	}

	// 메서드 작성 구문
	public void fileSave() {
		ObjectOutputStream objOut = null;
		try {
			objOut = new ObjectOutputStream(new FileInputStream("test.txt")); 
			objOut.writeObject(new Book("자바를 정복하자", 35000)); 
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				if(objOut != null) {
					objOut.close(); 
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
	
