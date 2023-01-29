import java.util.Scanner;
import java.util.HashSet;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//HashSet은 Collection 중 Set의 파생 클래스
//중복되는 원소가 있을 경우 하나만 저장
//순서 개념이 없음
HashSet<Integer> array = new HashSet<Integer>();

for (int i = 0; i < 10; i++) {
	array.add(sc.nextInt() % 42);
//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
}

sc.close();
//배열의 남아있는 숫자들의 개수를 출력
System.out.print(array.size());
sc.close();
}
}