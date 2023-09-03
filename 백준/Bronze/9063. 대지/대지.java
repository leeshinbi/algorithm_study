import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 점의 개수를 입력 받습니다.
        int minX = Integer.MAX_VALUE; // 가장 작은 x 좌표를 최대값으로 초기화합니다.
        int maxX = Integer.MIN_VALUE; // 가장 큰 x 좌표를 최소값으로 초기화합니다.
        int minY = Integer.MAX_VALUE; // 가장 작은 y 좌표를 최대값으로 초기화합니다.
        int maxY = Integer.MIN_VALUE; // 가장 큰 y 좌표를 최소값으로 초기화합니다.

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt(); // x 좌표를 입력 받습니다.
            int y = scanner.nextInt(); // y 좌표를 입력 받습니다.

            // 현재 점의 좌표로부터 최소, 최대 x, y 좌표를 갱신합니다.
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        // 둘러싸는 직사각형의 넓이를 계산합니다.
        int area = (maxX - minX) * (maxY - minY);
        System.out.println(area);

        scanner.close();
    }
}
