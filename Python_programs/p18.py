#evaluate using conditional statement check whether an item is available in the list and written available or not available approriately
items=['book','pen','pencil','eraser','sharpner']
item=input("Enter item to search:")
print("Available" if item in items else "Not available")  