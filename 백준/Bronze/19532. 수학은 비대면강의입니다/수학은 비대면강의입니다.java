import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        
        int x, y;
        
        x = (e * c - b * f) / (a * e - b * d); // 연립방정식 푸는 과정 
        y = (c * d - a * f) / (b * d - a * e);
        
        System.out.println(x + " " + y);
        
        scanner.close();
    }
}
