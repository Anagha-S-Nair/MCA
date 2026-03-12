#To search an item in a given list and display the number of occurrences of the given item
def search_item(name, item):
    count = 0
    for i in name:
        if i.lower() == item.lower():
            count += 1
    return count

name = input("Enter the list of items separated by spaces: ").split()
items = input("Enter the item to search: ")

print(f"The number of occurrences of '{items}' is {search_item(name, items)}")
