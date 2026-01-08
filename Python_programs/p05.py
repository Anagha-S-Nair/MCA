#To check if a given key already exists in a dictionary
"""dict1={1:1,2:4,3:9,4:16}
print(dict1)
key=int(input("Enter the key"))
print("key already exits",key in dict1.keys())"""

#To sort a dictionary in ascending order
"""dict1={9:81,3:9,7:49,4:16}
print(dict1)
print("Ascending order:",dict(sorted(dict1.items())))"""

#To create an inverted dictionary
dic1={1:1,2:2,3:1,4:2,5:1}
print("Original dictionary:",dic1)
print({v:k for k,v in dic1.items()})