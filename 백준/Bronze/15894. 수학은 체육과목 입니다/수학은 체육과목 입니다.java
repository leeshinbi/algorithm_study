import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 한 변의 길이를 입력받습니다.
        long sideLength = scanner.nextLong();

        // 정사각형의 모든 변의 길이를 계산합니다.
        long totalLength = sideLength * 4;

        // 결과를 출력합니다.
        System.out.println(totalLength);

        // 스캐너를 닫습니다.
        scanner.close();
    }
}
