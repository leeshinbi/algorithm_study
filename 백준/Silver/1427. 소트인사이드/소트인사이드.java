import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine(); // 입력 받기
        scanner.close();
        
        int length = st.length();
        int[] digits = new int[length];
        
        // 문자열을 숫자 배열로 변환
        //if st="12345" , digits 배열에는 [1, 2, 3, 4, 5]라는 숫자 배열이 저장됨 
        for (int i = 0; i < length; i++) {
            digits[i] = st.charAt(i) - '0';
        }
        
        //정렬
        Arrays.sort(digits);
        
        // 결과 출력 (역순으로 출력)
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
