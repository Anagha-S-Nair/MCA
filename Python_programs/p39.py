#Given a string of odd length greater than 7,return a new string made of the middle 3 characters of the given string.
def middle_three(s):
    if len(s) < 7 or len(s) % 2 == 0:
        raise ValueError("String must be of odd length greater than 7.")
    mid=len(s) // 2
    return s[mid-1:mid+2]

text=input("Enter a string of odd length greater than 7: ")
print("Middle three characters:", middle_three(text))