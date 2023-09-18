import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sugarWeight = scanner.nextInt();
        scanner.close();

        int bagCount = -1; // 최소 봉지 개수를 저장할 변수, 초기값을 -1로 설정하여 불가능한 경우를 체크

        // 5kg 봉지로 가능한 만큼 나누어보고, 남은 무게가 3kg로 나누어질 수 있는지 확인
        for (int count5 = sugarWeight / 5; count5 >= 0; count5--) {
            int remainingWeight = sugarWeight - (5 * count5);
            if (remainingWeight % 3 == 0) {
                bagCount = count5 + (remainingWeight / 3);
                break;
            }
        }

        System.out.println(bagCount);
    }
}
