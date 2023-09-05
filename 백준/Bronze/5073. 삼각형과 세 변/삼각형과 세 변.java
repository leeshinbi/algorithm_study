import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // 무한 루프로 입력 계속 받는다.
            int a = scanner.nextInt(); // 첫 번째 변의 길이 입력
            int b = scanner.nextInt(); // 두 번째 변의 길이 입력
            int c = scanner.nextInt(); // 세 번째 변의 길이 입력

            if (a == 0 && b == 0 && c == 0) {
                break; // 입력이 0, 0, 0이면 프로그램 종료
            }

            // 삼각형의 세 변의 길이 중 가장 긴 변을 찾음
            int maxSide = Math.max(Math.max(a, b), c);

            // 나머지 두 변의 길이의 합을 계산
            int sumOfOtherSides = a + b + c - maxSide;

            // 삼각형의 종류를 판별
            if (maxSide >= sumOfOtherSides) {
                System.out.println("Invalid"); // 삼각형이 아닌 경우
            } else if (a == b && b == c) {
                System.out.println("Equilateral"); // 정삼각형
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles"); // 이등변삼각형
            } else {
                System.out.println("Scalene"); // 일반 삼각형
            }
        }

        scanner.close();
    }
}
