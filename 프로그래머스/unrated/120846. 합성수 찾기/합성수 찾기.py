def solution(n):
    def count_divisors(num):
        count = 0
        for i in range(1,num+1):
            if num%i == 0:
                count+=1
        return count
    
    answer = 0
    for i in range(4,n+1):
        if count_divisors(i)>=3:
            answer+=1
    return answer