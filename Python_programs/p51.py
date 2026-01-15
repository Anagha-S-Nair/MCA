#Remove a line from the file
inf = False
try:
    n=int(input("Enter line number to remove: "))
    inf = open("sample.txt", "r")
    lines = inf.readlines()
    print(lines)
    lines.pop(n-1)
    inf.writelines(lines)
    print(lines)
except IOError as io:
    print("File error:", io)
finally:
    if inf:
        inf.close()