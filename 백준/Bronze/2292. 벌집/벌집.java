 
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int count = 1; // 겹 수
		int range = 2;	// 범위 
 
		if (N == 1) { // 입력값이 1이면 바로 1 출력
			System.out.print(1);
		}
 
		else {
			while (range <= N) {
				range = range + (6 * count); // 6씩 커진다는 속성 사용
				count++;	// count 증가
			}
			System.out.print(count);
		}
	}
}