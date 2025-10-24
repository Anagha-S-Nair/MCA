#List comprehensions
##Create a list of positive numbers from a given list of numbers 
"""num=list(map(int,input("Enter a list of numbers: ").split()))
pos_num=[n for n in num if n>0]
print("Positive numbers in the list: ",pos_num)"""

#Generate a list of squares of numbers from a given list
"""num=list(map(int,input("Enter a list of numbers: ").split()))
sq_num=[n**2 for n in num]
print("Square of numbers in the list: ",sq_num)"""

#From a list containing vowels from a guvwn word
"""word=input("Enter a word: ").lower()
vowels=[char for char in word if char in 'aeiou']
print("Vowels in the word: ",vowels)"""

#Generate a list of numbers by removing even numbers from a given list
"""num=list(map(int,input("Enter a list of numbers: ").split()))
odd_num=[n for n in num if n%2]
print("List after removing even numbers: ",odd_num)"""

#Display leap years from current year to a future year entered by user 
current_year=2025
future_year=int(input("Enter a future year: "))
leap_year=[year for year in range(current_year,future_year+1)if year%4==0]
print("Leap years between",current_year,"and",future_year,": ",leap_year)