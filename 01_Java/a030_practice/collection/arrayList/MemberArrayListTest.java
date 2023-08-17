package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이시이");
		Member memberSon = new Member(1002, "손민우");
		Member memberPark = new Member(1003, "박재혁");  // 새로운 회원 인스턴스 생성
		Member memberHong = new Member(1004, "홍길동");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark); // ArrayList에 회원 추가
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember(); // 전체 회원 출력
		
		memberArrayList.removeMember(memberHong.getmemberId()); // 홍길동 회원 삭제
		memberArrayList.showAllMember(); // 홍길동 회원을 삭제한 후 다시 전체회원 출력
	}

}
