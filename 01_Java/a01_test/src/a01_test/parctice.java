package a01_test;

public class parctice {
	
	public static void main(String[] args) {
			String [] fruits = new String[5];
	fruits[0] = "사과";
	fruits[1] = "바나나";
	fruits[2] = "오렌지";
	fruits[3] = "키위";
	fruits[4] = "수박";
	for(String fruit : fruits) {
		System.out.println(fruit);
	}


	}
	
	public class Member {
		public Member() {}
		private String name;
		private int age;
		private String address;
		private String hobby;
		public Member(String name, int age, String address, String hobby) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.hobby = hobby;				
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address = address;}
	public String getHobby() {return hobby;}
	public void setHobby(String hobby) {this.hobby = hobby;	
}

	
}	
}

