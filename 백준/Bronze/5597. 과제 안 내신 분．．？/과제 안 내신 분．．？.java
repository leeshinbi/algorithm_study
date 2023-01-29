import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//1부터 시작하니까 30이 아니라 31로 설정
int[] array = new int[31];

//28개의 숫자를 입력받고,
//입력받은 배열의 값을 1로 설정 후 
//그 배열을 다시 array에 넣는다.
for (int i = 1; i < 29; i++) {
	int array2 = sc.nextInt();
	array[array2] = 1;
}
//array의 배열 값에서 아까넣은 1의 값이 아닌게
//곧 차집합의 내용이니까
//그 값을 출력
for (int i = 1; i < array.length; i++) {
	if (array[i] != 1)
		System.out.println(i);
}

sc.close();
}
}