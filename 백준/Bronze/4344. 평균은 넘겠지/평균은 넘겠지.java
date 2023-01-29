import java.util.Scanner;


public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//테스트 케이스의 개수
int C = sc.nextInt();

int[] array; //배열의 값을 모두 더한 값

for(int i=0; i<C; i++) {
	int N = sc.nextInt(); //각 테스트 케이스마다의 학생의 수
	array = new int[N];
	
	double sum = 0;
	//성적 입력
	for(int j=0; j<N; j++){
	int value = sc.nextInt(); 
	array[j] = value;
	sum+=value;
	}
	double avg=sum/N; //배열의 평균
	double count = 0; //평균 값을 넘는 학생 수 
	
	//평균이 넘는 점수를 가진 학생 수 구하기
	for(int j=0; j<N; j++){
	if(array[j]>avg)
	{
		count++;
	}
	}
	
	//소수점 셋째 자리까지 출력
System.out.printf("%.3f%%\n",(count/N)*100);

}
sc.close();
}
}
