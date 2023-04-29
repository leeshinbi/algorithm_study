import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int cnt=0;
        while(in.hasNextInt()){
            x=in.nextInt();
            if(x>0)
                cnt++;
        }
        System.out.println(cnt);
    }
}