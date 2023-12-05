def solution(my_string):
    result=[]
    for char in my_string:
        if char.isdigit():
            result.append(int(char))
    result.sort()
    return result
