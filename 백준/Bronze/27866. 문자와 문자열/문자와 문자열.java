import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String[] st = sc.next().split("");
        int n = sc.nextInt();
        
        System.out.println(st[n-1]);
        }
}