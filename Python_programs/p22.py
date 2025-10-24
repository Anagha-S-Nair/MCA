#Count the number of even and odd numbers in a list
def count_oddeven(num_list):
    count_e=0
    count_o=0
    for num in num_list:
        if not num%2:
            count_e+=1
        else:
            count_o+=1
    return count_o,count_e
num_list=list(map(int,input("Enter the list: ").split()))
odd,even=count_oddeven(num_list)
print("The number of even elements: ",even)
print("The number of odd elements: ",odd)