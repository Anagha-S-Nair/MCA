#Print out all colors from color_list1 that are not present in color_list2
"""color_list1=['red','green','blue','pink']
color_list2=['green','white']
result=[]
for color in color_list1:
    if color not in color_list2:
        result.append(color)
print("colors in list1 but not in list2",result)"""

#Remove duplicates from a list
"""list1=[1,2,3,10,3,2,1]
result=list(set(list1))
print("List after removing duplicates",result)"""

#Check whether a list is empty or not
list2=[]
if not list2:
    print("List is empty")
else:
    print("Not empty")