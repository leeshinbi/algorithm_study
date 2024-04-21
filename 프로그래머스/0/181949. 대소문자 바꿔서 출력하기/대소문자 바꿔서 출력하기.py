str = input()

converted = ''
for char in str:
    if char.islower():
        converted += char.upper()
    else:
        converted += char.lower()
        
print(converted)