package practice;

public class practice10 {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2); // 두 실수를 더한 후 그 값을 형변환
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
