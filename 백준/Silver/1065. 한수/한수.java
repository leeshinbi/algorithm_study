import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(sequence(sc.nextInt())); //sequence 함수 호출
	}
	
		
public static int sequence(int num) {
	int count = 0; //한수의 개수 = count
	
	if(num<100) //1~99의 경우에는 그 수 자체가 수열이기에 num을 return 
	{
		return num;
	}
	else //num이 100보다 클 경우, 
	{
		count = 99; //처음 한수 최소 초기화 값: 99개
	
		for(int i=100; i<=num; i++)
		{
			int three = i/100; //백의 자리
			int two = (i/10)%10; //십의 자리
			int one = i%10; //일의 자리
			
			if((three-two)==(two-one)) { //각 자리가 수열을 이룬다면(공차의개념),
				count++; //한수의 개수를 늘린다.
			}
		}
    }
	return count;
	}
}  