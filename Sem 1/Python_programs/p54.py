# Remove comments from a file
inf = False
try:
    inf = open("sample.txt", "r")
    lines = inf.readlines()
    inf.close()

    res = []
    for line in lines:
        if not line.lstrip().startswith("#"):
            res.append(line)

    inf = open("sample.txt", "w")
    inf.writelines(res)

    print("Comments removed successfully")

except IOError as io:
    print("File error:", io)

finally:
    if inf:
        inf.close()
