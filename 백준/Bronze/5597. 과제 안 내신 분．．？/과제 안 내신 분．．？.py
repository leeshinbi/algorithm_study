attendance = [0] * 31

for i in range(28):
    student_number = int(input())
    attendance[student_number] = 1
    
for i in range(1,31):
    if attendance[i] == 0:
        print(i)
        break
        
for i in range(i+1,31):
    if attendance[i] == 0:
        print(i)
        break