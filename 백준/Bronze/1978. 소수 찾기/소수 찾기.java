import java.util.Scanner;

public class Main {
    // 소수인지 판별하는 함수
    public static boolean Prime(int num) {
        if (num <= 1) {
            return false; // 1과 1보다 작은 수는 소수가 아님
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                return false; // i로 나누어 떨어지면 소수가 아님
            }
        }
        return true; // 나누어 떨어지지 않으면 소수임
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 입력받을 숫자의 개수
        int count = 0; // 소수의 개수를 세는 변수

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt(); // 숫자를 하나씩 입력받음
            if (Prime(num)) {
                count++; // 소수인 경우 개수를 증가시킴
            }
        }

        System.out.println(count); // 소수의 개수 출력
    }
}
