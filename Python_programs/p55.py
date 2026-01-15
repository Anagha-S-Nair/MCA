# Retrieve phone numbers starting with 6,7,8,9

import re
inf = False

try:
    inf = open("outs.txt", "r")
    text = inf.read()

    pattern = r'[6-9]\d{9}'
    matches = re.findall(pattern, text)

    if matches:
        print("Phone numbers found:")
        for number in matches:
            print(number)
    else:
        print("No phone numbers found.")

except IOError as e:
    print(e)

finally:
    if inf:
        inf.close()