import java.util.Scanner;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

	int N = sc.nextInt();
//행의 개수
	for (int i = 1; i <= N; i++) {
		//열의 개수 
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}