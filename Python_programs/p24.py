#Write lambda function to find the largest of 2 numbers
a=float(input("Enter the first number: "))
b=float(input("Enter the second number: "))
max_num=lambda a,b: a if a>b else b
print("The largest is: ",max_num(a,b))

#To check the input number is divisible by 5
num=int(input("Enter a number: "))
divisibility=lambda num: not num%5
print("Divisibility? ",divisibility(num))

# Take input and split into list of words
str_list = input("Enter words separated by space: ").split()
# Use lambda with filter to keep words of length >= 5
new_list = list(filter(lambda s: len(s) >= 5, str_list))
print("New list:", new_list)

#To increment a list of integers by 10% if the number is greater than 1000 else by 5%
num_list = list(map(float, input("Enter the list: ").split())) 
new_list = lambda nlist: [x * 1.1 if x > 1000 else x * 1.05 for x in nlist] 
print("New list:", new_list(num_list))


