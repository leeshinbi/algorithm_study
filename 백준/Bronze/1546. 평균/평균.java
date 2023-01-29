import java.util.Scanner;


public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//시험 본 과목의 개수 N
int N = sc.nextInt();

double[] array = new double[N];
double M = 0; //최댓값 M
double avg = 0; //평균

for(int i=0; i<N; i++) {
	array[i] = sc.nextInt();
	if(array[i]>M) {
		M = array[i];
	}
}

for(int j=0; j<N; j++) {
	avg += (array[j]/M*100)/N;
}
System.out.println(avg);
sc.close();

}
}