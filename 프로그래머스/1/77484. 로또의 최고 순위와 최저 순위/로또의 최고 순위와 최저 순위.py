def solution(lottos, win_nums):
    rank = [6,6,5,4,3,2,1] #0과 1일 경우 둘 다 6임
    
    zero = lottos.count(0)
    correct = 0
    
    for i in lottos:
        if i in win_nums:
            correct += 1
    
    return [rank[correct+zero],rank[correct]]