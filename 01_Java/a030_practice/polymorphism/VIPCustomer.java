package polymorphism;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) { // VIPCustomer 필드 지정
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio); // 지불 가격 메서드 재정의
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 "+ agentID + "입니다"; // 고객 정보 출력 메서드 재정의
	}
	
	public int getAgentID() {
		return agentID;     // AgentID 메서드 재정의
	}

}
