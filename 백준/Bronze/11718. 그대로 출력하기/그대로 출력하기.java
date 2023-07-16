import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
      //hasNext()를 사용하여, 다음 줄이 없을 때까지 while문을 반복하여 출력한다.
        while(sc.hasNext()) { 
        	String st = sc.nextLine();
        	System.out.println(st);
        }
    }
}
