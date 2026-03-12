#create a list of first names and count how many start with 'a'
first_names=input("Enter the names").split(',')
count=0
for name in first_names:
    if name.strip().lower().startswith('a'):
        count+=1
print("Number of names starting with A: ",count)

#Each word in a line
line=input("Enter a line: ")
words=line.split()
print("Words in the line: ")
for word in words:
    print(word)