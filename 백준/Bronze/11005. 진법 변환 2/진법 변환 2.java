import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 10진수와 변환할 진법 입력 받기
        int N = scanner.nextInt(); // 10진수 숫자
        int B = scanner.nextInt(); // 변환할 진법

        // 변환 결과 출력
        String result = convertToBase(N, B);
        System.out.println(result);
    }

    // 10진수를 지정한 진법으로 변환하는 함수
    public static String convertToBase(int num, int base) {
        StringBuilder sb = new StringBuilder();

        // 10진수를 지정한 진법으로 변환
        while (num > 0) {
            int remainder = num % base;
            if (remainder < 10) {
                sb.insert(0, remainder); // 0~9 사이의 숫자는 그대로 추가
            } else {
                sb.insert(0, (char) ('A' + remainder - 10)); // 10 이상은 A, B, C, ... 로 표현
            }
            num /= base;
        }

        return sb.toString(); // 변환 결과 반환
    }
}
