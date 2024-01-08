count_set = set() #중복 허용하지 않는 set 사용

for i in range(10):
    num = int(input())
    count = num % 42
    count_set.add(count)
    
print(len(count_set))