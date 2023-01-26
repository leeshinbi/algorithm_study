import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

int N = sc.nextInt();

int[] array = new int[N];
int cnt = 0;

for(int i=0;i<N;i++)
{
	array[i]=sc.nextInt();
}

//Arrays.sort() 메소드 사용
//배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드
Arrays.sort(array);
System.out.print(array[0]+" "+array[N-1]);

}
}