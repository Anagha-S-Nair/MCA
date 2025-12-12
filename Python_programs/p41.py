#write a python program to check the validity of a password input by users.
#Validation:
#At least 1 letter between [a-z] and 1 letter between [A-Z].
#At least 1 number between [0-9].
#At least 1 character from [$#@].
#Minimum length 6 characters.   
#Maximum length 16 characters.
import re
def is_valid_password(password):
    if (6 <= len(password) <= 16 and
        re.search(r'[a-z]', password) and
        re.search(r'[A-Z]', password) and
        re.search(r'[0-9]', password) and
        re.search(r'[$#@]', password)):
        return True
    return False    
password = input("Enter a password: ")
if is_valid_password(password):
    print("Valid password")
else:
    print("Invalid password")
    