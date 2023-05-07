package practice;

public class practice35 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3]; // 이차원 배열을 선언만 하고 초기화는 하지 않음
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) { // i는 행 j는 열
				System.out.println(arr[i][j]);
			}
			System.out.println(); // 초기화되지 않은 행과 열 출력
		}
		System.out.println(arr.length);  // 열 길이 출력
		System.out.println(arr[0].length); // 행 길이 출력
	}

}
