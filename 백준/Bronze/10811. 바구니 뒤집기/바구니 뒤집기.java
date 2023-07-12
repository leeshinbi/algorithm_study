import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];
        for(int i = 0; i < N; i++){
            basket[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            int START = sc.nextInt()-1;
            int END = sc.nextInt()-1;

            while(START < END){
                int temp = basket[START];
                basket[START] = basket[END];
                basket[END] = temp;
                START++;
                END--;
            }
        }

        for(int i = 0; i < N; i++){
            System.out.print(basket[i]+ " ");
        }
    }
}