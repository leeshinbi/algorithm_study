import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);

        // 네 개의 점을 저장할 변수를 선언합니다.
        int x1, x2, x3, y1, y2, y3;

        // 각각의 점의 x 좌표와 y 좌표를 입력받습니다.
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();

        // 각각의 x 좌표와 y 좌표를 비교하여 누락된 점을 찾습니다.
        // 직사각형을 이루는 점의 특성은 다음과 같습니다:
        // 1. x 좌표가 누락된 점의 x 좌표와 같거나, y 좌표가 누락된 점의 y 좌표와 같으면 안됩니다.
        // 2. x 좌표가 누락된 점의 x 좌표와 다르고, y 좌표가 누락된 점의 y 좌표와 다르면 누락된 점입니다.

        int x4, y4;

        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        // 누락된 점의 x 좌표와 y 좌표를 출력합니다.
        System.out.println(x4 + " " + y4);

        // 스캐너를 닫습니다.
        scanner.close();
    }
}
