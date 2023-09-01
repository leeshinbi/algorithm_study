import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt(); //가로 길이 
        int M = scanner.nextInt(); //세로 길이

        int result = N * M;

        System.out.println(result);

        scanner.close();
    }
}