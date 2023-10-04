import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 체스판의 행 개수
        int M = sc.nextInt(); // 체스판의 열 개수
        sc.nextLine(); // 개행 문자 처리

        char[][] board = new char[N][M];

        // 체스판 입력 받기
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minCount = Integer.MAX_VALUE;

        // 시작점을 (i, j)로 설정하여 체스판을 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int countW = 0; // 'W'로 시작하는 체스판을 만들 때 칠해야 하는 횟수
                int countB = 0; // 'B'로 시작하는 체스판을 만들 때 칠해야 하는 횟수

                // (i, j)부터 8x8 체스판 검사
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if ((x + y - i - j) % 2 == 0) { // (x, y) 위치의 행과 열 번호의 합이 짝수인 경우
                            if (board[x][y] != 'W') {
                                countW++;
                            }
                            if (board[x][y] != 'B') {
                                countB++;
                            }
                        } else { // (x, y) 위치의 행과 열 번호의 합이 홀수인 경우
                            if (board[x][y] != 'B') {
                                countW++;
                            }
                            if (board[x][y] != 'W') {
                                countB++;
                            }
                        }
                    }
                }

                // 현재 체스판을 모두 칠하는 횟수와 minCount 비교
                minCount = Math.min(minCount, Math.min(countW, countB));
            }
        }

        System.out.println(minCount);

        sc.close();
    }
}
