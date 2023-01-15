import java.util.Scanner; 

public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

int x;
x = sc.nextInt();

if(90<=x||x>=100) {
    System.out.println("A");
}
else if(80<=x||x>=89)
{
	System.out.println("B");
}
else if(70<=x||x>=79)
{
	System.out.println("C");
}
else if(60<=x||x>=69)
{
	System.out.println("D");
}
else
{
	System.out.println("F");
}

}
}