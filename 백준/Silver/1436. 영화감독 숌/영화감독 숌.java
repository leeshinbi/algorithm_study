
//1번째로 "666"이 포함된 숫자: 666
//2번째로 "666"이 포함된 숫자: 1666
//3번째로 "666"이 포함된 숫자: 2666
//4번째로 "666"이 포함된 숫자: 3666
//5번째로 "666"이 포함된 숫자: 4666
//6번째로 "666"이 포함된 숫자: 5666
//7번째로 "666"이 포함된 숫자: 6660
//8번째로 "666"이 포함된 숫자: 6661
//9번째로 "666"이 포함된 숫자: 6662
//...


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int count = 0;  // 666이 연속으로 등장하는 숫자의 개수
        int num = 0;    // 검사하는 숫자
        
        while (true) {
            String str = Integer.toString(num);
            if (str.contains("666")) {
                count++;  // 666이 연속으로 등장하는 경우 count를 증가
            }
            if (count == n) {
                System.out.println(num);
                break;
            }
            num++;  // 다음 숫자로 넘어감
        }
        
        scanner.close();
    }
}
