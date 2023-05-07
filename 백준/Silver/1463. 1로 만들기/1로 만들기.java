import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int dp[] = new int[X+1]; //dp[X]까지 가기 위해 dp[X+1]로 설정!

        for(int i=2; i<=X; i++) { //i가 1이면 1을 빼면 0이 되므로 , 2부터 시작한다
            dp[i] = dp[i-1] +1; //i를 1로 만드는 최소 연산 횟수 + 1

            if(i%2 == 0) // 숫자가 2로 나누어 떨어지면,
                dp[i] = Math.min(dp[i], dp[i/2]+1); // i를 1로 만드는 최소 연산 횟수 dp[i]와 2로 나누는 연산중 연산 횟수가 더 적은 방법 저장

            if(i%3 == 0) // 숫자가 3으로 나누어 떨어지면,
                dp[i] = Math.min(dp[i],  dp[i/3]+1); // i를 1로 만드는 최소 연산 횟수 dp[i]와 3으로 나누는 연산중 연산 횟수가 더 적은 방법 저장
        }
        System.out.println(dp[X]); 
    }
}