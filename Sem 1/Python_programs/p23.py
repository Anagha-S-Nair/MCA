#Write a function to get a new string from a given string by adding'ls' to the begining of the input string.
#if the given string already begins with 'ls',return the input string unchanged
def add_is(s):
    return s if s.startswith("Is") else "Is"+s
str=input("Enter a string: ")
print("Modified String: ",add_is(str))