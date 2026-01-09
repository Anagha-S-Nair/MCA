#write recurssive function to find the factorial of a number
"""def fact(n):
    if n==0 or n==1:
        return 1
    return n*fact(n-1)
n=int(input("Enter n: "))
print("Factorial ",fact(n))"""

#Find nth fibonacci number using recurssion
"""def fib(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    return fib(n-1)+fib(n-2)
n=int(input("Enter n: "))
print("Fibonacci number is ",fib(n))"""

#Find the sum of an integer list using recurssion
"""def sum_list(l):
    if not len(l):
        return 0
    return l[0]+sum_list(l[1:])
num_list = list(map(int, input("Enter the list: ").split()))
print("Sum of the list is ",sum_list(num_list))"""


#Sum of first n whole numbers using recurssion
"""def sum_list(n):
    if not n:
        return 0
    return n+sum_list(n-1)
n=int(input("Enter n: "))
print("Sum of first",n,"whole numbers is ",sum_list(n))"""

#Reverse a string using recurssion
def reverse_string(s):
    if len(s) == 1:
        return s
    return s[-1] + reverse_string(s[:-1])
s = input("Enter a string: ")
print("Reversed string is ", reverse_string(s))