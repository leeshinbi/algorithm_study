def count_words(sentence):
    words = sentence.split()
    
    return len(words)

string = input()

result = count_words(string)
print(result)