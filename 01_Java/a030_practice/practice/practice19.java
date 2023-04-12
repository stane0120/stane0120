package practice;

public class practice19 {
public static void main(String[] args) {
	int ranking = 1;
	char medalColor;
	
	switch(ranking) { // switch case문 설정
	case 1 : medalColor = 'G'; break;
	case 2 : medalColor = 'S'; break;
	case 3 : medalColor = 'B'; break;
	default: medalColor = 'M'; // 1~3이 아닌 값일시 이 값이 출력
	}
	System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다"); // 출력문
}
}
