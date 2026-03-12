#Add 'ing' at the end of the string. If already ends with 'ing' then add 'ly'.
word=input("Enter a string:")
if word.endswith('ing'):
    word+='ly'
else:
    word+='ing'
print("Modified string: ",word)