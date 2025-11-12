#Enter two collections of integers.
list1=list(map(int,input("Enter collection1: ").split()))
list2=list(map(int,input("Enter collection2: ").split()))

#Check whether they are of same length
if len(list1)==len(list2):
    print("Same length")
else:
    print("Different length")

#Check whether sums to the same value
if sum(list1)==sum(list2):
    print("same sum")
else:
    print("Different sum")

#whether any value occur in both
common=set(list1) & set(list2)
if common:
    print("Common elements are: ",common)
else:
    print("No common elements")