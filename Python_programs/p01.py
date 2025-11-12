#program to get a string from the user 
#a. replace all occurences of first character with $,except first character
#b. create a string from given string where first and last characters exchanged
""" s=input("Enter a string: ")
first_char=s[0]
result=first_char+s[1:].replace(first_char,'$')
print("Modified string",result) """

s=input("Enter a string: ")
if len(s)<1:
    result=s
else:
    result=s[-1]+s[1:-1]+s[0]
print("After swapping:",result)