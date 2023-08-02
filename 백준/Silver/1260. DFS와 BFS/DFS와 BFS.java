import java.util.*;

public class Main {

    static int N, M, V; // 공유되는 상수이기 때문에 static으로 정의 
    static ArrayList<Integer>[] graph; // 그래프는 arraylist 형식으로 나타냄
    static boolean[] visited; // 방문한 노드는 boolean 형식으로 나타냄
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();  // 정점 개수
        M = sc.nextInt(); // 간선 개수
        V = sc.nextInt(); // 시작 정점 번호 
        
        // 정점 넣어서 그래프 생성 
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 간선 개수 만큼 간선 정보 입력
        for (int i = 0; i < M; i++) { 
            int from = sc.nextInt();
            int to = sc.nextInt();
        	
            // 양방향 그래프라 양쪽에 추가
            graph[from].add(to);
            graph[to].add(from);
        }
        
        // 정점 번호가 작은 것부터 순서대로 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS 수행
        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();
        
        // BFS 수행
        visited = new boolean[N + 1];
        bfs(V);

    }
    
    // -------------------- 여기서 부터 함수 -------------------- //
    
    // DFS 함수 (깊이 우선 탐색)
    static void dfs(int node) {
        visited[node] = true; // 'node'에 해당하는 정점을 방문했다고 표시 
        System.out.print(node + " "); // 해당 정점 번호 출력 
        
        for (int next : graph[node]) { // 'node'에 연결된 모든 정점들을 탐색
            if (!visited[next]) { // 연결된 정점 'next'에 대해서 아직 방문하지 않았다면,
                dfs(next); // 해당 정점에서 DFS함수 재귀적으로 호출 
            }
        }
    }
    
    // BFS 함수 (너비 우선 탐색)
    static void bfs(int start) {
    	
        // 탐색할 정점들을 순서대로 저장 -> 먼저 들어온 정점 먼저 탐색 
        // 큐(queue) 사용
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start); 
        visited[start] = true;
        
        while (!queue.isEmpty()) { // 큐가 비어있을 때까지 반복 
            int current = queue.poll(); // 큐에서 하나의 정점을 뽑아서 'current'에 저장
            System.out.print(current + " ");
            
            for (int next : graph[current]) { // 'current'와 연결된 모든 정점들을 탐색
                if (!visited[next]) { // 연결된 정점 'next'를 방문하지 않았다면,
                    queue.add(next); // 큐에 추가
                    visited[next] = true;
                }
            }
        }
    }
}
