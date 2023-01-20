import java.util.Scanner; 

public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

int H,M,T;
H = sc.nextInt();
M = sc.nextInt();
T = sc.nextInt();

H += T/60;
M += T%60;

if(M>=60)
{
	H=H+1;
	M=M-60;
}
	if(H>=24)
	{
		H=H-24;
	}
	System.out.println(H+ " " + M);

}
}