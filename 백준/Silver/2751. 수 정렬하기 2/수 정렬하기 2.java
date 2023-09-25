import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 정수의 개수 입력
        int[] numbers = new int[N];

        // 정수 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 배열 정렬
        Arrays.sort(numbers);

        // 정렬된 배열 출력
        for (int i = 0; i < N; i++) {
            bw.write(numbers[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
