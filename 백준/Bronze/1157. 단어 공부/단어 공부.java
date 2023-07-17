import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int[] alpha = new int[26]; //영문자 개수 26개
        int count = 0;
        char result = 0; //결과 값
        
        //문자열의 중간지점을 기준으로 
        for(int i=0; i<str.length(); i++)
        {
        	if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') //대문자 범위
        	{
        		alpha[str.charAt(i) - 'A']++; 
        	}
        	else //소문자 범위
        	{
        		alpha[str.charAt(i) - 'a']++;
        	}
        }
    
        for(int i=0; i<alpha.length; i++)
        {
        	if(alpha[i]>count)
        	{
        		count = alpha[i];
        		result = (char)(i+'A');
        	}
        	else if(alpha[i]==count)
        	{
        		result = '?';
        	}
        		
        }

        System.out.println(result);
    }
}
