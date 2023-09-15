import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int result = findNum(N);

        if (result == 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }

    public static int findNum(int N) {
        for (int i = 1; i < N; i++) {
            int sum = i;
            int number = i;

            while (number > 0) {
                sum += number % 10; //각 자릿수 더하기 
                number /= 10;
            }

            if (sum == N) { //각 자릿수 합의 결과가 입력값과 같다면 분해합임
                return i;
            }
        }

        return 0; // 분해합을 찾지 못한 경우
    }
}
