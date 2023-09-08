import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long res = Long.valueOf(0);
        for (int i = 1; i < n; i++) {
            res += i;  //7이면, res = 1+2+...5+6
        }
        System.out.println(res);
        System.out.println(2);
    }

}