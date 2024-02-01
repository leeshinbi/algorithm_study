N = int(input())
canvas = [[0] * 100 for i in range(100)]  # 전체 좌표 도화지

for i in range(N):
    x, y = map(int, input().split())  # 색종이의 왼쪽 아래 모서리 좌표 입력 받음

    for j in range(x, x + 10):
        for k in range(y, y + 10):
            canvas[j][k] = 1

area = sum(row.count(1) for row in canvas)  # 색종이가 포함되어 있는 구역의 넓이

print(area)