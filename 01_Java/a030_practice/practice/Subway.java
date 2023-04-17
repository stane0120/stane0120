package practice;

public class Subway {
	String lineNumber;  // 지하철 몇호선, 승객 수, 지하철 수입
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {  // 몇호선인지 매개변수로 받는 생성자
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {  // 지하철 수입
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() { // 지하철 정보를 출력하는 메서드
		System.out.println(lineNumber + "의 승객은 " +passengerCount + "명이고, 수입은" + money + "입니다");
	}

}
