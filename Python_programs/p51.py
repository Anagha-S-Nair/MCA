# Remove a line from a file

inf = False
try:
    n = int(input("Enter line number to remove: "))
    
    inf = open("sample.txt", "r")
    lines = inf.readlines()
    print(lines)
    inf.close()

    lines.pop(n-1)

    inf = open("sample.txt", "w")
    inf.writelines(lines)
    print(lines)

    print("Line removed successfully")

except IOError as io:
    print("File error:", io)

finally:
    if inf:
        inf.close()
