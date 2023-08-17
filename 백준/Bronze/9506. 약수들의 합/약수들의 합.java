import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(); // 입력받을 수

            if (n == -1) {
                break; // 입력이 -1이면 종료
            }

            int sum = 0; // 약수들의 합을 저장할 변수

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i; // 약수일 경우 합에 더함
                }
            }

            if (sum == n) {
                System.out.print(n + " = 1"); // 완전수일 경우
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        System.out.print(" + " + i);
                    }
                }
                System.out.println(); // 줄 바꿈
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

        scanner.close();
    }
}
