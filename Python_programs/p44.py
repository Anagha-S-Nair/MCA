#write a function wich reverses each item in a list and return the new list.
def reverse_list(items):
    new_list=[]
    for item in items:
        new_list.append(item[::-1])
    return new_list
input_list = ['apple', 'banana', 'cut', 'programming']
print("Original list:", input_list)
print("Reversed items list:", reverse_list(input_list))