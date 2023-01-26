import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

//서로 다른 9개의 자연수 배열 생성
int[] array = new int[9];
int max = 0;
int index = 0;

for(int i=0; i<9; i++) {
 array[i] = sc.nextInt();
}

//max를 0부터 시작해서 인덱스 끝까지
//한 개씩 비교하면서 최대값을 찾아가는 과정
for(int i=0; i<9; i++) {
 if(array[i]>max) {
    max = array[i];
    index = i+1; //배열의 자릿수를 나타내는 index
 }
}

System.out.println(max);
System.out.println(index);
}
}