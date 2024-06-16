from collections import deque

def meeting(campus, start, n, m):
    
    directions = [(-1,0),(1,0),(0,-1),(0,1)]
    queue = deque([start])
    visited = [[False]*m for _ in range(n)]
    visited[start[0]][start[1]] = True 
    
    people_count = 0 
    
    while queue:
        x,y = queue.popleft()
        
        for dx,dy in directions:
            nx,ny = x+dx, y+dy
            
            if 0<=nx<n and 0<=ny<m and not visited[nx][ny]:
                if campus[nx][ny] != 'X':
                    visited[nx][ny] = True
                    queue.append((nx,ny))
                    if campus[nx][ny] == 'P':
                        people_count += 1
                        
    return people_count

# 입력
n,m = map(int, input().split())
campus = [input().strip() for _ in range(n)]

#시작 위치 찾기 (도연이의 위치)
start = None
for i in range(n):
    for j in range(m):
        if campus[i][j] == 'I':
            start = (i,j)
            break
    if start:
        break
        
#bfs 실행
result = meeting(campus,start,n,m)

if result == 0:
    print("TT")
else:
    print(result)