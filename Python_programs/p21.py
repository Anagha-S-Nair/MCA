#Count the number of strings where the string length is 2 or more and the first and last character are same.
def count_string(strings):
    count=0
    for s in strings:
        if len(s)>=2 and s[0]==s[-1]:
            count+=1
    return count
str=input("Enter the string: ").split()
print("The number of matching strings is:",count_string(str))