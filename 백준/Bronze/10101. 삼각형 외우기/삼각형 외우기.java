import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 세 각의 크기를 입력받는다.
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        // 입력받은 세 각의 합이 180이 아니거나, 각각의 크기가 0보다 작다면
        if (angle1 + angle2 + angle3 != 180 || angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("Error");
        } else if (angle1 == angle2 && angle2 == angle3) {
            // 세 각의 크기가 모두 같으면, Equilateral 출력
            System.out.println("Equilateral");
        } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            // 두 개의 각의 크기가 같으면, Isosceles 출력
            System.out.println("Isosceles");
        } else {
            // 모든 조건에 해당하지 않으면, Scalene 출력
            System.out.println("Scalene");
        }

        scanner.close();
    }
}
