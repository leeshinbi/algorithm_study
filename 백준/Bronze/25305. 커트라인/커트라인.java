import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 응시자 수
        int k = scanner.nextInt(); // 상을 받는 사람의 수
        
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }
        
        Arrays.sort(scores); // 점수를 오름차순으로 정렬
        
        int cutline = scores[N - k]; // 커트라인은 상을 받는 사람 중 가장 낮은 점수
        System.out.println(cutline);
    }
}
