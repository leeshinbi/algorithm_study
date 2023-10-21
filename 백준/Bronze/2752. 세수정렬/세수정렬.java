import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // 배열 정렬
        Arrays.sort(numbers);

        // 정렬된 숫자 출력
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i]);
            if (i < 2) {
                System.out.print(" ");
            }
        }
    }
}
