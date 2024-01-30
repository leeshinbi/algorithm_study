grid = [list(map(int, input().split())) for _ in range(9)]

# 최댓값과 해당 위치 초기화
max_value = 0
max_row, max_col = 0, 0

for i in range(9):
    for j in range(9):
        if grid[i][j] >= max_value:
            max_value = grid[i][j]
            max_row, max_col = i + 1, j + 1

print(max_value)
print(max_row, max_col)
