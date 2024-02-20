def find_divisor(N, K):
    divisors = []

    for i in range(1, N + 1):
        if N % i == 0:
            divisors.append(i)

    if K <= len(divisors):
        return divisors[K - 1]
    else:
        return 0

N, K = map(int, input().split())

result = find_divisor(N, K)
print(result)
