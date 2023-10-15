import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        scanner.close();

        int[] arr = {a, b, c};
        Arrays.sort(arr); // 배열을 정렬

        int middle = arr[1]; // 중간값은 정렬된 배열의 두 번째 원소

        System.out.println(middle);
    }
}
