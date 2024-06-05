
import sys

input = sys.stdin.readline

n,m = map(int, input().split())
map = [list(map(int,input().split())) for _ in range(n)]
chk = [[False] * m for _ in range(n)] # 방문 횟수

dy = [0,1,0,-1]
dx = [1,0,-1,0]


def bfs(y,x):
    rs = 1
    q = [(y,x)]
    while q:
        ey,ex = q.pop()
        for k in range(4):
            ny = ey+dy[k]
            nx = ex+dx[k]
            if 0<=ny<n and 0<=nx<m:
                if map[ny][nx] == 1 and chk[ny][nx] == False:
                    rs+=1
                    chk[ny][nx] = True
                    q.append((ny,nx))
    return rs

cnt = 0 # 전체 그림 개수
maxv = 0 # 최대값

for j in range(n):  # 보통 2중 for문을 할 때에는 y부터
    for i in range(m):  # 여기서 m을 사용해야 함
        if map[j][i] == 1 and not chk[j][i]:
            chk[j][i] = True  # 방문으로 변경
            # 전체 그림 개수를 +1
            cnt += 1
            # BFS > 그림 크기를 구해줌
            maxv = max(maxv, bfs(j, i))
            # 최대값 갱신

print(cnt)
print(maxv)

