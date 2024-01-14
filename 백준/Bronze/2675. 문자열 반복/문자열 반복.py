T = int(input())

for i in range(T):
    R,S = input().split()
    R = int(R)
    
    result = ""
    
    for char in S:
        result += char*R
    
    print(result)