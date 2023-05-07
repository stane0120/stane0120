package practice;

public class practice33 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}}; // 이차원 배열 선언과 동시에 초기화
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) { // 중첩 for문, i는 행을 j는 열을 카리킨다
				System.out.println(arr[i][j]);
			}
			System.out.println(); // 행 출력이 끝난 후 한줄을 띄움
		}
	}

}
