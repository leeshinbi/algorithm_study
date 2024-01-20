def is_palindrome(word):
    reversed_word = word[::-1]
    
    if word == reversed_word:
        return 1
    else:
        return 0
    
input_word = input().strip()
print(is_palindrome(input_word))