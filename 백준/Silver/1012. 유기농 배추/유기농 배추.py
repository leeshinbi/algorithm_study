from collections import deque
import sys
input = sys.stdin.read

def bfs(field,x,y,n,m):
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    queue = deque([(x,y)])
    field[x][y] = 0 # 방문한 배추는 0으로 표시
    
    while queue:
        cx,cy = queue.popleft()
        
        for dx,dy in directions:
            nx,ny = cx+dx, cy+dy
            
            if 0 <= nx < n and 0 <= ny < m and field[nx][ny] == 1:
                field[nx][ny] = 0
                queue.append((nx,ny))
                
def main():
    data = input().strip().split()
    index = 0
    T = int(data[index])
    index += 1
    
    results = []
    
    for _ in range(T):
        M = int(data[index]) # 가로
        N = int(data[index+1]) # 세로
        K = int(data[index+2]) # 배추 개수
        index += 3
        
        # 배추밭 초기화
        field = [[0]* M for _ in range(N)]
        
        #배추 위치 설정
        for _ in range(K):
            x = int(data[index]) # 열
            y = int(data[index+1]) # 행
            field[y][x] = 1 # [행][열]
            index += 2
            
        count = 0
        
        for i in range(N):
            for j in range(M):
                if field[i][j] == 1:
                    bfs(field,i,j,N,M)
                    count+=1
                    
        results.append(count)
        
    for result in results:
        print(result)
        
main()
            