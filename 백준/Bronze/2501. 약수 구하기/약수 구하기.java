import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N: 주어진 수, K: K번째 약수
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int count = 0; // 현재까지 찾은 약수의 개수
        int result = 0; // K번째 약수

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // i가 N의 약수인 경우
                count++;
                if (count == K) { // K번째 약수를 찾았을 때
                    result = i;
                    break;
                }
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
