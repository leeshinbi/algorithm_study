def conversion_to_decimal(N, B): # B진법으로 표현된 수 N을 10진법으로 변환하는 함수 
    decimal_value = 0 #10진법으로 변환된 값
    length = len(N)

    for i in range(length):
        char = N[length - 1 - i]
        if '0' <= char <= '9':
            decimal_value += int(char) * (B ** i)
        else:
            decimal_value += (ord(char) - ord('A') + 10) * (B ** i)

    return decimal_value


N, B = input().split()
B = int(B)

result = conversion_to_decimal(N, B)
print(result)
