package a0000_practice;

public class Test1Practice {
	public void test() {
		practice[] ii = new practice[3]; 
		ii[0] = new practice("192.123.19.7", "강건강");   
		ii[1] = new practice("192.100.42.30", "남나눔");
		ii[2] = new practice("192.27.3.12", "도대담");
		
		for(int i = 0; i < ii.length; i++) { 

			System.out.println("ip : " + ii[i].getIp());
		}
	}

}
