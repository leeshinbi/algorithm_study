import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] canvas = new int[100][100]; // 전체 좌표 도화지
        
        int N = sc.nextInt();
        
        for(int i = 0; i<N; i++)
        {
        	int x = sc.nextInt(); // 색종이의 왼쪽 아래 모서리 좌표 입력 받음
        	int y = sc.nextInt();
        	
        	for(int j = x; j<x+10; j++)
        	{
               for(int k = y; k<y+10; k++) {
            	   canvas[j][k] = 1;
               }
        	}
        	}
        
        int area = 0; //색종이가 포함되어 있는 구역의 넓이
        
        for(int i = 0; i<100; i++)
        {
        	for(int j = 0; j<100; j++)
        	{
        		if(canvas[i][j] == 1) {
        			area++;
        		}
        	}
        }
        
        System.out.println(area);
    }
}
