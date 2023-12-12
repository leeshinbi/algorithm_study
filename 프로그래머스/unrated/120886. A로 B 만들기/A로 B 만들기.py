def solution(before, after):
    
    sort_before = sorted(before)
    sort_after = sorted(after)
    
    if sort_before==sort_after:
        return 1
    else:
        return 0