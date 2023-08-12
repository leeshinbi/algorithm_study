import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // X 값을 입력받음
        int X = scanner.nextInt();
        
        // 입력 받은 후 Scanner 닫기
        scanner.close();
        
        // 현재 줄을 나타내는 변수
        int line = 1;
        
        // X가 몇 번째 줄에 속하는지 찾기 위한 루프
        while (X > line) {
            X -= line; // X에서 현재 줄을 빼줌
            line++;    // 다음 줄로 넘어감
        }
        
        // 분자와 분모를 나타내는 변수
        int numerator, denominator;
        
        // 짝수 번째 줄과 홀수 번째 줄일 때 분자와 분모 계산 방식이 다름
        if (line % 2 == 0) {
            numerator = X;                 // 짝수 번째 줄에서 분자는 X
            denominator = line - X + 1;    // 짝수 번째 줄에서 분모는 line - X + 1
        } else {
            numerator = line - X + 1;      // 홀수 번째 줄에서 분자는 line - X + 1
            denominator = X;               // 홀수 번째 줄에서 분모는 X
        }
        
        // 결과 분수 출력
        System.out.println(numerator + "/" + denominator);
    }
}
