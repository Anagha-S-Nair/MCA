#Count the number of lines
inf = False

try:
    inf = open('python.txt',encoding = 'UTF-8')
    lines = inf.readlines()
    print(lines)
    print('No. of lines: ',len(lines))

except IOError as ie:
    print(ie)

finally:
    if inf:
        inf.close()