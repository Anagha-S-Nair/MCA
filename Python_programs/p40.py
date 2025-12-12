#Arrange charachters in a string such that lowercase letters should come first.
def lowercase_first(s):
    lowercase=[c for c in s if c.islower()]
    other=[c for c in s if not c.islower()]
    return ''.join(lowercase + other)
text=input("Enter a string: ")
result = lowercase_first(text)
print("Rearranged string:", result)