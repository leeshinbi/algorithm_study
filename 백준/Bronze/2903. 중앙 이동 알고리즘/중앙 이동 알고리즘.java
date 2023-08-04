import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // N 입력 받기

        // 꼭짓점 개수 계산
        int totalPoints = calculateTotalPoints(N);

        System.out.println(totalPoints);
    }

    // 꼭짓점 개수 계산 함수
    static int calculateTotalPoints(int N) {
        // 첫 번째 정사각형은 2의 2N승 개의 꼭짓점을 가짐
        // 두 번째 정사각형부터는 이전 정사각형의 점 개수에서 2씩 빼면서 더함
        int totalPoints = 2;

        for (int i = 1; i <= N; i++) {
            totalPoints += (totalPoints - 1);
        }

        return totalPoints * totalPoints; // 모든 정사각형의 꼭짓점 개수의 제곱
    }
}
