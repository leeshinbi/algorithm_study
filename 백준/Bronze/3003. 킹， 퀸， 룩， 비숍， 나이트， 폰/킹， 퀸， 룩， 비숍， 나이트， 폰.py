x = list(map(int,input().split()))

correct = [1,1,2,2,2,8]

result = [correct[i]-x[i] for i in range(len(x))]
print(" ".join(map(str,result)))