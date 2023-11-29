def solution(n):
    count = 0
    
    for i in range(1, int(n**0.5) + 1):
        if n % i == 0:
            count += 1
            # i와 n//i가 같은 경우는 약수가 중복으로 세어지는 경우를 방지하기 위해 하나만 추가
            if i != n // i:
                count += 1

    return count