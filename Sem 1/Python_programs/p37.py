#Check whether a given positive integer is a power of 2. Raise custom exception for neggative input.
def is_power_of_two(n):
    if n < 0:
        raise ValueError("Negative input is not allowed.")
    return  (n & (n - 1)) == 0
try:
    num = int(input("Enter a positive integer: "))
    if is_power_of_two(num):
        print(f"{num} is a power of 2.")
    else:
        print(f"{num} is not a power of 2.")
except ValueError as ve:
    print("Error",ve)
