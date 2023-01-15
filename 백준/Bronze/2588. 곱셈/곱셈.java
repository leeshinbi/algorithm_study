import java.util.Scanner; 

public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
	
 int A,B,C,D,F;
 A = sc.nextInt();
 B = sc.nextInt();
 
 C = A*(B%10);
 D = A*((B%100)/10);
 F = A*(B/100);
 
 System.out.println(C);
 System.out.println(D);
 System.out.println(F);
 System.out.println(A*B);
 
}
}