numbers = [int(input()) for i in range(9)]

max_num = max(numbers)
max_num_index = numbers.index(max_num) + 1

print(max_num)
print(max_num_index)