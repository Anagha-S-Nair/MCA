#Create a rectangle class with attributes length and breadth, and  methods to find area and perimeter.Compare two rectangles objects by their area.
class Rectangle:
    def __init__(self,length,breadth):
        self.length=length
        self.breadth=breadth
    def area(self):
        return self.length*self.breadth
    def perimeter(self):
        return 2*(self.length+self.breadth)
rect1=Rectangle(5,3)
rect2=Rectangle(4,4)
print("Rectangle 1-Area:",rect1.area(),"Perimeter:",rect1.perimeter())
print("Rectangle 2-Area:",rect2.area(),"Perimeter:",rect2.perimeter())
if rect1.area()>rect2.area():
    print("Rectangle 1 has larger area")
elif rect1.area()<rect2.area():
    print("Rectangle 2 has larger area")
else:
    print("Both rectangles have equal area")
        
