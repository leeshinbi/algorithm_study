def solution(answers):
    
    # 각 수포자의 찍는 방식 패턴
    pattern1 = [1, 2, 3, 4, 5]
    pattern2 = [2, 1, 2, 3, 2, 4, 2, 5]
    pattern3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    # 점수 초기화 [0,0,0]
    score = [0 for i in range(3)]

    # 답안과 수포자 패턴 비교 
    for i in range(len(answers)):
        ans = answers[i]
        if(pattern1[i%len(pattern1)] == ans):
            score[0] += 1
        if(pattern2[i%len(pattern2)] == ans):
            score[1] += 1
        if(pattern3[i%len(pattern3)] == ans):
            score[2] += 1    
    
    # 가장 많은 문제를 맞힌 수포자 찾기 
    result = []
    for i in range(len(score)):
        if(score[i] == max(score)):
            result.append(i+1)
            
    return sorted(result)