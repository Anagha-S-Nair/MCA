#Print fibonacci series up to a limit given by user and print nth term 
num=int(input("Enter the number of terms: "))
f1,f2=0,1
print(f1)
print(f2)

for i in range(1,num-1):
    f1,f2=f2,f2+f1
    print(f2)
term=int(input("Enter the term to find Fibonacci number: "))
f1,f2=0,1
if term==1:
    print("Fibonacci number at term",term,"is",f1)
elif term==2:
    print("Fibonacci number at term",term,"is",f2)
else:
    for i in range(term-2):
        f1,f2=f2,f1+f2
    print("Fibonacci number at term",term,"is",f2)