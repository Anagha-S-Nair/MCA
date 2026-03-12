#Longest word from a comma separated list
words=input("Enter comma separated words: ").split(',')
longest=max(words,key=len)
print("Longest word",longest)