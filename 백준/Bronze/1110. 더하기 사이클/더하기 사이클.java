import java.util.Scanner;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

int N = sc.nextInt(); 
//초기 N값을 저장하기 위해 변수를 따로 지정
int copy = N;
//count는 0으로 초기화
int count=0;

//십의자리와 일의자리를 나눠서 더함
while(true) {
//N값을 반복해서 바꿔줘야하기 때문에 N값으로 계산함
N = ((N%10)*10)+((N/10)+(N%10))%10;
//얼마나 반복했는지를 알기 위해 count 사용 
count++;

if(copy==N)
{
	break;
}
}

System.out.println(count);
sc.close();
}
}