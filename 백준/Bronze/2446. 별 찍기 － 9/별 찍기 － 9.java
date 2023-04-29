import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);

          int n = in.nextInt();

        //역삼각형
          for(int i=1; i<=n; i++){
              for(int j=1; j<=i-1; j++)
              {
                  System.out.print(" "); //공백 출력
              }
              for(int j=n*2-i; j>=i;j--){
                  System.out.print("*");
              }
              System.out.print("\n");
          }

          for(int i=1; i<=n-1; i++)
          {
              for(int j=n-1; j>i; j--) {
                  System.out.print(" ");
              }
              for(int j=1;j<=(2*i+1);j++){
                  System.out.print("*");
              }
              System.out.print("\n");
          }
    }
}