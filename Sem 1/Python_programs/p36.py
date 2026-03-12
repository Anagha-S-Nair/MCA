#Create a class complex with private attributes real and imaginary parts.Overload '>=' operator to find the greatest number.
class Complex:
    def __init__(self, real, imaginary):
        self.__real = real
        self.__imaginary = imaginary

    def magnitude(self):
        return (self.__real**2 + self.__imaginary**2) ** 0.5
    
    def __ge__(self, other):
        return self.magnitude() >= other.magnitude()
    
    def __str__(self):
        return f"{self.__real} + {self.__imaginary}i"

c1 = Complex(3, 4)  
c2 = Complex(1, 7)  

if c1 >= c2:
    print(f"{c1} has greater or equal magnitude than {c2}")
else:   
    print(f"{c2} has greater magnitude than {c1}")  