
N, M = map(int, input().split())

baskets = [0] * N

for _ in range(M):
    # i부터 j까지의 바구니에 k번 공을 넣음
    i, j, k = map(int, input().split())
    for idx in range(i-1, j):
        baskets[idx] = k

print(*baskets)
