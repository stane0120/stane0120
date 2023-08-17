package collection;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;      // 회원 아이디
		this.memberName = memberName;  // 회원 이름      // Member 클래스의 속성
	}
	
	public int getmemberId() {
		return memberId;
	}
	
	public void setmemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;   // getter / setter 메서드
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다";
	}  // toString() 메서드에서 재정의

}
