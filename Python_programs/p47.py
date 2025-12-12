#Display alternate characters from a line of text using recursion.
def alternate_chars(text, index=0):
    if index >= len(text):
        return ""
    return text[index] + alternate_chars(text, index + 2)
line="Hello World"
result = alternate_chars(line)
print("Original line:", line)
print("Alternate characters:", result)