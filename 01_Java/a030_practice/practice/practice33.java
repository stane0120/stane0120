package practice;

public class practice33 {
	int day;
	int month;
	int year;
	
	public void setYear(int year) {  // 연도를 지정하는 메서드
		this.year = year; // bDay.year = year;와 같음
	}
	
	public void printThis() { // this 출력 메서드
		System.out.println(this); // System.out.println(bDay);와 같음
	}
}

public class ThisExample { // ThisExample 파일이 없어서 오류
	public static void main(String[] args) {
		practice33 bDay = new practice33();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
} // 태어난 연고를 2000으로 지정, 참조 변수 출력, this 출력 메서드 호출
