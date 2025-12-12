#Create a class Person with private attributes name and age.Compare 2 persons by their age.
class Person:
    def __init__(self, name, age):
        self.__name = name
        self.__age = age

    def get_age(self):
        return self.__age

    def get_name(self):
        return self.__name

    def __gt__(self, other):
        return self.__age > other.get_age()
    
    def __eq__(self, other):
        return self.__age == other.get_age()


p1 = Person("Alice", 30)
p2 = Person("Bob", 25)

if p1 > p2:
    print(f"{p1.get_name()} is older than {p2.get_name()}")
elif p1 == p2:
    print(f"{p1.get_name()} and {p2.get_name()} are of the same age")
else:
    print(f"{p2.get_name()} is older than {p1.get_name()}")
