import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;  // 이수한 과목의 총 학점
        double sum = 0.0;  // 전공평점의 합

        for (int i = 0; i < 20; i++) { // 20줄에 걸쳐 입력 받음 
            String str = sc.nextLine();
            String[] array = str.split(" "); // 입력을 공백 기준으로 나눔
            double score = Double.parseDouble(array[1]); // 첫번째 공백 후 입력은 학점 -> 실수형으로 반환
            String grade = array[2]; // 두번째 공백 후 입력은 등급 

            if (!grade.equals("P")) {  // 등급이 'P'가 아닌 경우에만 점수 계산!
                n += score; // 총학점 
                switch (grade) {  // 등급에 따라 평점 계산
                    case "A+":
                        sum += 4.5 * score;
                        break;
                    case "A0":
                        sum += 4.0 * score;
                        break;
                    case "B+":
                        sum += 3.5 * score;
                        break;
                    case "B0":
                        sum += 3.0 * score;
                        break;
                    case "C+":
                        sum += 2.5 * score;
                        break;
                    case "C0":
                        sum += 2.0 * score;
                        break;
                    case "D+":
                        sum += 1.5 * score;
                        break;
                    case "D0":
                        sum += score;
                        break;
                    case "F":
                        sum += 0.0;
                        break;
                }
            }
        }
        double average = sum / n;  // 전공평점
        System.out.println(average);
    }
}
