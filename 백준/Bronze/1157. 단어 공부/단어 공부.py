from collections import Counter

def most_common_letter(word):
    letter_counts = Counter(word.lower())
    
    max_count = max(letter_counts.values())
    most_common_letters = [letter.upper() for letter, count in letter_counts.items() if count == max_count]
    
    if len(most_common_letters) == 1:
        return most_common_letters[0]
    else:
        return '?'
    
input_word = input().strip()

print(most_common_letter(input_word))
