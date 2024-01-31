
words = []

for _ in range(5):
    word = input().rstrip()
    words.append(word)

# 최대 글자 수는 15이므로 15번 반복
for i in range(15):
    for j in range(5):
        # 현재 줄이 i번째 글자를 가지고 있을 경우 출력
        if i < len(words[j]):
            print(words[j][i], end='')

print()