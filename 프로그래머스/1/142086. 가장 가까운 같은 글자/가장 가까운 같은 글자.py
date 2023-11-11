def solution(s):
    result =[]
    seen = {}
    
    for i,char in enumerate(s):
        if char not in seen:
            result.append(-1)
        else:
            result.append(i-seen[char])
        seen[char] = i
    return result