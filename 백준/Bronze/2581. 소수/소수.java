import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int m = scanner.nextInt(); // 시작 정수
        int n = scanner.nextInt(); // 끝 정수
        
        int minPrime = n; // 최소 소수 초기값은 끝 정수로 설정
        int sum = 0; // 소수들의 합
        
        // m부터 n까지의 숫자들을 탐색하여 소수인지 확인
        for (int num = m; num <= n; num++) {
            if (isPrime(num)) { // 소수인지 확인하는 함수 호출
                sum += num; // 소수이면 합에 더하기
                if (minPrime > num) {
                    minPrime = num; // 현재 최소 소수 갱신
                }
            }
        }
        
        // 소수가 하나도 없는 경우
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
    
    // 소수인지 확인하는 함수
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false; // 0과 1은 소수가 아님
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // num이 i로 나누어지면 소수가 아님
            }
        }
        return true; // 위 조건에 해당하지 않으면 소수임
    }
}
