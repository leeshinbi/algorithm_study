import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt(); //문자열의 개수 입력받기
		String st = sc.next(); //문자열 입력받기
		
		int sum = 0; //총 더한 값
		
		for(int i=0; i<N; i++)
		{
			sum+=st.charAt(i)-48; 
		}
    System.out.println(sum);

	}
	
	}