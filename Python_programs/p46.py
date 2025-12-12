#write a program that retrieves all lines from a file having words starting 's' and ending with 'e'.
import re
pattern= re.compile(r'\bs\w*e\b', re.IGNORECASE)
with open('sample.txt', 'r') as file:
    for line in file:
        if pattern.search(line):
            print(line.strip())