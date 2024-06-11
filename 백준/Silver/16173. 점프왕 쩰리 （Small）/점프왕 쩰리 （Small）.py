from collections import deque

def game(N,map):
    queue = deque([(0,0)])
    visited = [[False]*N for _ in range(N)]
    visited[0][0] = True
    
    while queue:
        x,y = queue.popleft()
        
        # 현재 위치 
        jump = map[x][y]
        
        # 목표 지점에 도착했다면?
        if jump == -1:
            return "HaruHaru"
        
        #오른쪽으로 이동 
        if y+jump<N and not visited[x][y + jump]:
            queue.append((x, y + jump))
            visited[x][y + jump] = True
            
        # 아래로 이동
        if x + jump < N and not visited[x + jump][y]:
            queue.append((x + jump, y))
            visited[x + jump][y] = True
            
    return "Hing"
 
N = int(input())
map = [list(map(int,input().split())) for _ in range(N)]

print(game(N,map))