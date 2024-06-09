from collections import deque
import sys
input = sys.stdin.readline
n,m = map(int, input().split())
maps = [list(map(int, input().strip())) for _ in range(n)]

def solution(maps):
    n = len(maps)
    m = len(maps[0])
    
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    
    queue = deque([(0, 0, 1)])  # (x, y, distance)
    visited = set([(0, 0)])
    
    while queue:
        x, y, distance = queue.popleft()
        
        if x == n - 1 and y == m - 1:
            return distance
        
        for dx, dy in directions:
            nx = x + dx
            ny = y + dy
            
            if 0 <= nx < n and 0 <= ny < m and maps[nx][ny] == 1 and (nx, ny) not in visited:
                visited.add((nx, ny))
                queue.append((nx, ny, distance + 1))
                
    return -1

print(solution(maps))
