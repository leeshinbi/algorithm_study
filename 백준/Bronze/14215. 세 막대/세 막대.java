import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int[] rod = new int[3]; // 세 개의 막대 길이를 저장할 배열

        // 세 개의 막대 길이 입력
        for (int i = 0; i < 3; i++) {
            rod[i] = scanner.nextInt();
        }

        Arrays.sort(rod); // 막대 길이를 오름차순으로 정렬

        int a = rod[0]; // 가장 짧은 막대
        int b = rod[1]; // 중간 길이의 막대
        int c = rod[2]; // 가장 긴 막대

        if (c < a+b) {
            System.out.println(a+b+c);
        }
        else {
         System.out.print((a+b)*2-1);
        }
        scanner.close();
    }
}
