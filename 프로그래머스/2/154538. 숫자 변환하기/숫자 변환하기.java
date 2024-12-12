import java.util.*;

public class Solution {
    public int solution(int x, int y, int n) {
        // BFS를 위한 큐와 방문 여부 확인 배열
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[y + 1];

        // 초기 상태 추가
        queue.offer(new int[]{x, 0}); // {현재 값, 연산 횟수}
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int value = current[0];
            int operations = current[1];

            // 목표 값에 도달한 경우 최소 연산 횟수 반환
            if (value == y) {
                return operations;
            }

            // 다음 상태로 이동 가능한 경우 확인
            int[] nextValues = {value + n, value * 2, value * 3};
            for (int next : nextValues) {
                if (next <= y && !visited[next]) {
                    queue.offer(new int[]{next, operations + 1});
                    visited[next] = true;
                }
            }
        }

        // 목표 값에 도달할 수 없는 경우 -1 반환
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 테스트 케이스
        System.out.println(solution.solution(10, 40, 5)); // 2
        System.out.println(solution.solution(10, 40, 30)); // 1
        System.out.println(solution.solution(2, 5, 4)); // -1
    }
}
