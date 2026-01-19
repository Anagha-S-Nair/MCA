#write a program that retrieves all lines from a file having words starting 's' and ending with 'e'.
"""import re
pattern= re.compile(r'\bs\w*e\b', re.IGNORECASE)
with open('sample.txt', 'r') as file:
    for line in file:
        if pattern.search(line):
            print(line.strip())"""

import re

# open file
inf = open('sample.txt', 'r')

# read all lines
lines = inf.readlines()

# regex pattern: word starting with 's' and ending with 'e'
pattern = re.compile(r'\bs\w*e\b', re.IGNORECASE)

# check each line
for line in lines:
    if pattern.search(line):
        print(line.strip())

# close file
inf.close()
