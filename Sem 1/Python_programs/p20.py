#To remove all odd indexed characters from a given string
def remove_char(s):
    return s[::2]
str=input("Enter a string: ")
print("Modified string: ",remove_char(str))