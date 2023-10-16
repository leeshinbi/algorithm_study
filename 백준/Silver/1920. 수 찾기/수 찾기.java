import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N개의 숫자를 포함하는 배열을 입력받는다.
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 입력받은 배열을 정렬한다.
        Arrays.sort(arr);

        // M개의 숫자를 포함하는 배열을 입력받는다.
        int M = sc.nextInt();
        int[] target = new int[M];
        for (int i = 0; i < M; i++) {
            target[i] = sc.nextInt();
        }

        // 각 숫자가 배열에 있는지 확인하고 결과를 출력한다.
        for (int i = 0; i < M; i++) {
            int result = binarySearch(arr, target[i]);
            System.out.println(result);
        }
    }

    // 이진 탐색을 사용하여 배열에서 특정 숫자를 찾는 함수
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return 1; // 찾았을 경우
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0; // 찾지 못했을 경우
    }
}
