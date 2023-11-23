def solution(arr1, arr2):
    answer = []
    
    for i in range(len(arr1)): #행
        row=[]
        for j in range(len(arr1[i])): #첫번째 행의 모든 열들을 반복
            row.append(arr1[i][j]+arr2[i][j])
        answer.append(row)
    return answer