import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String st = sc.next();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
