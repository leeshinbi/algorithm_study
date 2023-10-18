import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 숫자 카드의 개수 N
        HashSet<Integer> cards = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int card = sc.nextInt();
            cards.add(card);
        }

        int m = sc.nextInt(); // 확인하고 싶은 숫자 카드의 개수 M
        int[] toCheck = new int[m];

        for (int i = 0; i < m; i++) {
            toCheck[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (cards.contains(toCheck[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        
        sc.close();
    }
}
