package practice;

public class cooperation {
	public static void main(String[] args) {
		
		practice34 studentJames = new practice34("James", 5000);
		practice34 studentTomas = new practice34("Tomas", 10000);   // 학생 생성
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();    // James가 버스에 탄 정보
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);  // Tomas가 버스에 탄 정보
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}

}
