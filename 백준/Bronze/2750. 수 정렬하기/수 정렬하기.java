import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 숫자의 개수 입력
        int[] numbers = new int[N]; // 입력받을 숫자들을 저장할 배열

        // 숫자 입력 받기
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 배열 정렬
        Arrays.sort(numbers);

        // 정렬된 숫자 출력
        for (int i = 0; i < N; i++) {
            System.out.println(numbers[i]);
        }

        // 스캐너 닫기
        scanner.close();
    }
}
