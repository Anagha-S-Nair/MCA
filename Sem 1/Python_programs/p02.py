#Create a single string separated by space from two strings by swapping the character at position 1
"""str1=input("Enter first string: ")
str2=input("Enter second string: ")
list1=list(str1)
list2=list(str2)
list1[1],list2[1]=list2[1],list1[1]
new_list1="".join(list1)
new_list2="".join(list2)
result=new_list1+" "+new_list2
print("After swapping: ",result)"""

#Create a list of colors from comma separarted list of colors entered by user and print alternate colors
colors=input("Enter colors: ").split(',')
print(colors)
alternate_colors=colors[::2]
print(alternate_colors)
for color in alternate_colors:
    print(color)
