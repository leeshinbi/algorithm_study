import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 낮에 올라가는 미터 수, 밤에 미끄러지는 미터 수, 나무 막대의 높이 입력 받기
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        // 하루에 A미터 올라가고 B미터 미끄러짐
        // 정상에 도달하려면 몇 일이 걸리는지 계산
        // (V - B - 1) / (A - B) 에서 -1을 하는 이유는 정상에 도달한 후에는 미끄러지지 않기 때문
        int days = (V - B - 1) / (A - B) + 1;

        // 결과 출력
        System.out.println(days);

        // Scanner 사용 후 닫아주기
        scanner.close();
    }
}
