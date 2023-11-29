def solution(sizes):
    max_width = 0
    max_height = 0

    for size in sizes:
        max_width = max(max_width, min(size))
        max_height = max(max_height, max(size))

    answer = max_width * max_height
    return answer