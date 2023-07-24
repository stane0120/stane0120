package polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이정혁");
		customerLee.bonusPoint = 1000;  // 변수 선언
		
		System.out.println(customerLee.showCustomerInfo()); // customerLee.showCustomerInfo 구문 출력
		
		Customer customerKim = new VIPCustomer(10020, "김유신", 12345); // VIPCustomer를 Customer형으로 선언
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo()); // customerKim.showCustomerInfo 구문 출력
		System.out.println("===== 할인율과 보너스 포인트 계산 ======");
		
		int price = 10000;
		int leePrice = customerLee.calcPrice(price);
		int kimPrice = customerKim.calcPrice(price); // 지불 가격 재정의
		
		System.out.println(customerLee.getCustomerName() + " 님이 " + leePrice + "원 지불하셨습니다"); // 얼마를 지불했다는 구문 출력
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + " 님이 " + kimPrice + "원 지불하셨습니다");
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
