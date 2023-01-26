import java.util.Scanner;

public class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

int N = sc.nextInt();
int X = sc.nextInt();
int[] array = new int[N];
int cnt = 0;

for(int i=0;i<N;i++)
{
	array[i]=sc.nextInt();
}

for(int i=0; i<array.length;i++)
{
	if(X>array[i]) {
	System.out.println(array[i]);
	}
}
}
}