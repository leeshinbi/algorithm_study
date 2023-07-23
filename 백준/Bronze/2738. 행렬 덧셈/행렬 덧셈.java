import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] array = new int[N][M];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
		//두 번의 반복을 통해 두 번의 입력 값을 받아 배열에 더한다.
					array[j][k] += sc.nextInt();
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				//결과 배열 출력
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}