num_list=list(map(int,input("Enter a number: ").split()))
sum=0
if num_list==[]:
    print("Empty List")
else:
    for i in num_list:
        sum+=i
    print("Sum of numbers in the list: ",sum)