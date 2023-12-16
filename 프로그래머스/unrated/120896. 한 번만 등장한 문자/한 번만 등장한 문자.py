def solution(s):
    char_count = {}

    # 문자열 s에서 각 문자의 등장 횟수를 세기
    for char in s:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1

    # 등장 횟수가 1인 문자들을 찾아서 리스트에 저장
    unique_chars = []
    for char, count in char_count.items():
        if count == 1:
            unique_chars.append(char)

    # 리스트를 사전 순으로 정렬
    unique_chars.sort()

    # 결과 문자열 생성
    answer = ''.join(unique_chars)

    return answer
    