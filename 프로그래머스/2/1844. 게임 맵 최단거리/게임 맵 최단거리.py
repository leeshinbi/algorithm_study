from collections import deque

def solution(maps):
    n = len(maps) # 행
    m = len(maps[0]) # 열 
    
    # 방향 (상,하,좌,우)
    directions = [(-1,0),(1,0),(0,-1),(0,1)]
    
    # 초기화 
    queue = deque([(0,0,1)]) # (현재 x, 현재 y, 거리 1)
    visited = set((0,0)) # 중복 허용 불가 set 
    
    while queue:
        x,y,distance = queue.popleft() # 큐에서 현재 위치와 거리 꺼냄
        
        #목적지에 도달했다면, 거리 반환
        if x == n-1 and y == m-1:
            return distance 
        
        # nx,ny = 새로운 위치 값 
        for dx,dy in directions:
            nx = x+dx
            ny = y+dy
            
            # 새로운 위치가 맵 안에 있고 & 벽이 아니며 & 방문하지 않은 위치라면 
            if 0<=nx<n and 0<=ny<m and maps[nx][ny] == 1 and (nx,ny) not in visited:
                visited.add((nx,ny))
                queue.append((nx,ny,distance+1))
                
    return -1
        
    