import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // 숫자 다음에 나오는 개행 문자 처리

        // 단어를 저장할 리스트 생성
        List<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            words.add(word);
        }

        // 중복 제거를 위해 Set을 사용하여 중복 제거 후 정렬
        Set<String> uniqueWords = new HashSet<>(words);
        List<String> uniqueWordsList = new ArrayList<>(uniqueWords);

        // 조건에 따라 정렬
        Collections.sort(uniqueWordsList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 길이가 짧은 순으로 정렬
                if (s1.length() != s2.length()) {
                    return Integer.compare(s1.length(), s2.length());
                }
                // 길이가 같을 경우 사전 순으로 정렬
                return s1.compareTo(s2);
            }
        });

        // 결과 출력
        for (String word : uniqueWordsList) {
            System.out.println(word);
        }
    }
}
