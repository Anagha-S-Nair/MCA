#Create a class rectangle with private attributes length and width.Overload '<' operator to compare the are a of two rectangles.
class Rectangle:
    def __init__(self, length, width):
        self.__length = length
        self.__width = width

    def area(self):
        return self.__length * self.__width

    def __lt__(self, other):
        return self.area() < other.area()
    
rect1 = Rectangle(5,3)
rect2 = Rectangle(4,6)
print("Area of Rectangle 1:", rect1.area())
print("Area of Rectangle 2:", rect2.area())
if rect1 < rect2:
    print("Rectangle 1 has a smaller area than Rectangle 2")    
else:
    print("Rectangle 1 has a larger or equal area than Rectangle 2")