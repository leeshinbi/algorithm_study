import java.util.Scanner;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//입력받는 값이 있는가 확인하는 방법: hasNext(),hasNextInt() 사용하기
while(sc.hasNextInt()) {
	
	int A = sc.nextInt();
	int B = sc.nextInt();

	System.out.println(A+B);

}
sc.close();
}
}