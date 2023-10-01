import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 좌표 개수 입력

        int[][] arrays = new int[N][2];

        // 좌표 입력 받기
        for (int i = 0; i < N; i++) {
            arrays[i][0] = scanner.nextInt(); // x 좌표
            arrays[i][1] = scanner.nextInt(); // y 좌표
        }

        // 좌표 정렬하기
        Arrays.sort(arrays, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) { // x 좌표가 같으면 y 좌표를 비교
                    return Integer.compare(a[1], b[1]);
                } else { // x 좌표가 다르면 x 좌표를 비교
                    return Integer.compare(a[0], b[0]);
                }
            }
        });

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.println(arrays[i][0] + " " + arrays[i][1]);
        }

        scanner.close();
    }
}
