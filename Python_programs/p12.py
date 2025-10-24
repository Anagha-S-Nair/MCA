"""#pattern printing
num=int(input("Enter number of lines: "))
for i in range(num+1):
    for k in range(num-i):
        print(" ",end="")
    for j in range(i):
        print("* ",end="")
    print()"""

for i in range(1, 6):       # rows
    for j in range(1, 5):   # columns
        if i == 1 or i == 3 or i == 5 or (i < 3 and j == 1) or (i > 3 and j == 4):
            print("*", end="")
        else:
            print(" ", end="")
    print()


"""
| Digit | Star Logic Summary                                           |
| ----- | ------------------------------------------------------------ |
| 0     | `i==1 or i==5 or j==1 or j==4` (except corners)              |
| 1     | `j==3`                                                       |
| 2     | `i==1 or i==3 or i==5 or (i==2 and j==4) or (i==4 and j==1)` |
| 3     | `i==1 or i==3 or i==5 or j==4`                               |
| 4     | `i==3 or j==4 or j==1 and i<3`                               |
| 5     | `i == 1 or i == 3 or i == 5 or (i < 3 and j == 1) or (i > 3 and j == 4)`            |
| 6     | i == 1 or i == 3 or i == 5 or j == 1 or (i >= 3 and j == 4)                                            |
| 7     | `i==1 or j==4`                                               |
| 8     | `i==1 or i==3 or i==5 or j==1 or j==4`                       |
| 9     | `i==1 or i==3 or j==4 or (i<=3 and j==1)`                    |
"""