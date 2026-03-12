#determine frequency of alphabet in a word
word=input("Enter a word: ").lower()
frequency={}
for char in word:
    if char in frequency:
        frequency[char]+=1
    else:
        frequency[char]=1
print("Character Frequency: ",frequency)