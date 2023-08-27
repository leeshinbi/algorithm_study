import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 입력받을 숫자

        // 2부터 시작해서 N이 1보다 큰 동안 반복
        for (int i = 2; N > 1; i++) {
            // i가 N을 나누는 소인수라면 계속 나누기
            while (N % i == 0) {
                System.out.println(i); // 소인수 출력
                N /= i; // N을 i로 나누어 소인수분해 진행
            }
        }

        scanner.close(); // 스캐너 닫기
    }
}
