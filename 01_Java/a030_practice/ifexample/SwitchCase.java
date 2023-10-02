package ifexample;

public class SwitchCase {
	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) { 
		  case 1 : medalColor = 'G'; // ranking이 1일때 G
		           break;
		  case 2 : medalColor = 'S'; // ranking이 2일때 S
		           break;
		  case 3 : medalColor = 'B'; // ranking이 3일때 B
		           break;
		  default:
			       medalColor = 'A'; // ranking이 나머지일때 A
		}
		System.out.println(ranking + "등 메달의 색깔은 " + medalColor + " 입니다.");
	}

}
