import java.util.Scanner; 

public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

int a, b, c;
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();

int max;

if(a!=b && a!=c && b!=c)
{
	if(a>b)
	{
		if(c>a)
		{
			max = c;
			System.out.println(max*100);
		}
		else 
		{
			max = a;
			System.out.println(max*100);
		}
	}
	if(b>a)
	{
		if(c>b)
		{
			max = c;
			System.out.println(max*100);
		}
		else 
		{
			max = b;
			System.out.println(max*100);
		}
	}
}
else 
{
	if(a==b&&b==c)
	{
		System.out.println(10000+a*1000);
	}
	else
	{
		if(a==b||a==c) {
			System.out.println(1000+a*100);
		}
		else 
		{
			System.out.println(1000+b*100);
		}
	}
}

}}