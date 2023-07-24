package polymorphism;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade; // protected 예약어로 변수 선언
	int bonusPoint; // 그냥 변수 선언
	double bonusRatio;
	
	public Customer() {
		initCustomer(); // 고객 등급과 보너스 포인트 적립률 지정 함수 호출
	}
	
	private void initCustomer() { // 멤버 변수의 초기화 부분
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public Customer(int customerID, String customerName) { // Customer 필드 정의
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price; // 지불 가격 메서드
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + " 입니다. "; // CustomerTest에서 출력되는 showCustomerInfo 구문
	}
	
	public int getCustomerID() { // 여기서부터 protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set() 메서드 추가
		return customerID;
	}

	public void setCustomerID(int customerId) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String string) {
		this.customerName = customerName;
	}



}
