import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        int B = scanner.nextInt();

        BigInteger result = convertToDecimal(N, B);
        System.out.println(result);
    }

    // 이 객체가 나타내는 값은 주어진 진법으로 표현된 숫자가 10진수로 변환된 결과입니다.
    static BigInteger convertToDecimal(String N, int B) {
        return new BigInteger(N, B);
    }
}
