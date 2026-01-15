#Find the longest word in a file

inf = False

try:
    inf = open('outs.txt')
    lines = inf.read().split()
    lines.sort(key=len,reverse=True)
    l = len(lines[0])
    print([x for x in lines if len(x)==l])

except IOError as e:
    print(e)

finally:
    if inf:
        inf.close()