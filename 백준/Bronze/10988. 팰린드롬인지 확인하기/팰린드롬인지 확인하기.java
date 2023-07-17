import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int check = 1;
        
        //문자열의 중간지점을 기준으로 
        for(int i=0; i<str.length()/2; i++)
        {
        	//문자열의 첫 알파벳과 끝 알파벳이 같은지 확인하는 과정
        	if(str.charAt(i)!=str.charAt(str.length()-1-i)) { 
        		check = 0;
        	}
        }
        System.out.println(check);
    }
}
