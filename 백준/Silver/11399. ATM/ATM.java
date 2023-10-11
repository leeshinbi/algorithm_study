import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //사람 수 
        int[] time = new int[n]; //각 사람의 인출 시간 
        
        for(int i = 0; i<n; i++)
        {
            time[i] = sc.nextInt();
        }
        
        Arrays.sort(time); //시간 순으로 정렬
        
        int total_time = 0;
        int waiting_time = 0;
        
        for(int i = 0; i<n; i++)
        {
            waiting_time += time[i];
            total_time += waiting_time;
        }
        
        System.out.println(total_time);
    }
}