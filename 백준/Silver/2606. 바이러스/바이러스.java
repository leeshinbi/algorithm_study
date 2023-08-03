import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 컴퓨터의 수
        int m = sc.nextInt(); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            graph[x].add(y);
            graph[y].add(x); // 양방향 그래프
        }

        visited = new boolean[n + 1];
        int result = dfs(1); // 1번 컴퓨터부터 시작하는 바이러스 전파

        // 1번 컴퓨터 자신은 카운트에서 제외
        System.out.println(result - 1); // 결과 출력
    }

    // 깊이 우선 탐색 (DFS) 함수 정의
    static int dfs(int node) {
        visited[node] = true;
        int count = 1;

        for (int next : graph[node]) {
            if (!visited[next]) {
                count += dfs(next);
            }
        }

        return count;
    }
}
