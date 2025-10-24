#write recurssive function to find the factorial of a number
"""def fact(n):
    if n==0 or n==1:
        return 1
    return n*fact(n-1)
n=int(input("Enter n: "))
print("Factorial ",fact(n))"""

#Sum of first n whole numbers using recurssion
def sum_list(n):
    if not n:
        return 0
    return n+sum_list(n-1)
n=int(input("Enter n: "))
print("Sum of first",n,"whole numbers is ",sum_list(n))