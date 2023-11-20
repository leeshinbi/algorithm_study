def solution(n):
    # 약수를 저장할 리스트
    divisors = []

    # 1부터 n까지 반복하면서 약수인지 확인
    for i in range(1, n + 1):
        if n % i == 0:
            divisors.append(i)


    return sum(divisors)
