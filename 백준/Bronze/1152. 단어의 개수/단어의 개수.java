import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        String st = sc.nextLine();
        
        for(int i = 0; i<st.length(); i++)
        {
          if(st.charAt(i)==' ') {
        	 count++;
          }
        }
        if(st.charAt(0) != ' ' && st.charAt(st.length()-1) != ' '){ //첫 번째와 마지막이 공백이 아닌 경우
            count = count + 1; 
        }
        if(st.charAt(0) == ' ' && st.charAt(st.length()-1) == ' '){ //첫 번째와 마지막이 공백인 경우
        	count = count - 1;
        }
        System.out.println(count);
    }
}
