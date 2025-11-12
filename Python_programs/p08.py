#print factorial of a number input by user
num=int(input("Enter a number: "))
fact=1
if num>0:
    for i in range(1,num+1):
        fact*=i
    print("Factorial of number: ",fact)
else:
    print("Ente a positive number")