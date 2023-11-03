class Solution {
    public int solution(int n) {
        int answer = 0; // 결과를 저장할 변수를 선언하고 초기화

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
