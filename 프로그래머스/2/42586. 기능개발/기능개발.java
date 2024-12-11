import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 작업의 남은 일수 계산
        Queue<Integer> daysQueue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remaining = 100 - progresses[i];
            int days = (int) Math.ceil((double) remaining / speeds[i]);
            daysQueue.offer(days);
        }

        // 배포별 기능 수 계산
        List<Integer> result = new ArrayList<>();
        while (!daysQueue.isEmpty()) {
            int deployDay = daysQueue.poll();
            int count = 1;

            // 같은 배포일에 포함될 작업 계산
            while (!daysQueue.isEmpty() && daysQueue.peek() <= deployDay) {
                daysQueue.poll();
                count++;
            }

            result.add(count);
        }

        // 결과를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}
