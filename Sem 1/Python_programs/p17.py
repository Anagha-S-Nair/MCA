#Accept a list of single digit numbers as input string .concatenate the elements of the list as a single number
def concatenate_number(digits):
    return int("".join(digits))

num=input("Enter numbers: ").split()
print("Single number: ",concatenate_number(num))

#Accept full name and display in reverse order with space between the words
def rev_name(full_name):
    name=full_name[::-1]
    return name
full_name=input("Enter the full name:").split()
print("Reversed name: ",' '.join(rev_name(full_name)))