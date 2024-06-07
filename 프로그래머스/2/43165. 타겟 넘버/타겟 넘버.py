def solution(numbers, target):
    def dfs(index, current_sum):
        # 종료 조건
        if index == len(numbers):
            return 1 if current_sum == target else 0
        
        # 현재 숫자를 더하거나, 빼거나 -> 두 가지 경우를 탐색 
        return dfs(index+1, current_sum+numbers[index]) + dfs(index+1, current_sum-numbers[index])
    
    # dfs 탐색 시작
    return dfs(0,0)
    
    