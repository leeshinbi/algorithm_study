from collections import deque
import sys

input = sys.stdin.read
data = input().split()

def bfs(graph, start, visited):
    queue = deque([start])
    visited[start] = True
    while queue:
        node = queue.popleft()
        for neighbor in graph[node]:
            if not visited[neighbor]:
                visited[neighbor] = True
                queue.append(neighbor)

# 입력
n = int(data[0])
m = int(data[1])

# 그래프 초기화
graph = [[] for _ in range(n + 1)]
visited = [False] * (n + 1)

# 간선 정보 추가
index = 2
for _ in range(m):
    u = int(data[index])
    v = int(data[index + 1])
    graph[u].append(v)
    graph[v].append(u)
    index += 2

# 연결 요소 개수 찾기
components = 0
for i in range(1, n + 1):
    if not visited[i]:
        bfs(graph, i, visited)
        components += 1

print(components)
