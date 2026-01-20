# Write a program to copy one file to another file

inf = False
outf = False

try:
    inf = open("sample.txt", "r")
    outf = open("copy.txt", "w")

    for line in inf:
        outf.write(line)
        print("copied")

except IOError as io:
    print("File error:", io)

finally:
    if inf:
        inf.close()
    if outf:
        outf.close()
