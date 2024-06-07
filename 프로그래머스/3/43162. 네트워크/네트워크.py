def solution(n,computers):
    def dfs(computer, visited):
        stack = [computer]
        while stack:
            node = stack.pop()
            for neighbor,connected in enumerate(computers[node]):
                # 연결되어 있고 & 방문하지 않았다면, 스택에 추가 
                if connected and not visited[neighbor]:
                    visited[neighbor] = True
                    stack.append(neighbor)
    
    # 초기화 
    visited = [False]*n
    network_count = 0
    
    # 방문하지 않았다면, dfs 실행 후 network_count 증가 
    for i in range(n):
        if not visited[i]:
            visited[i] = True
            dfs(i,visited)
            network_count+=1
            
    return network_count