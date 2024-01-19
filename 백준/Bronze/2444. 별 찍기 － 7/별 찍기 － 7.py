N = int(input())

for i in range(1, 2*N):
    if i <= N:
        spaces = " " * (N - i)
        stars = "*" * (2*i - 1)
    else:
        spaces = " " * (i - N)
        stars = "*" * (2*(N - (i - N)) - 1)

    # 한 줄 출력
    print(spaces + stars)
