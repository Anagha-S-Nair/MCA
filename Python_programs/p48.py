#Create class Person(name,roll) and Marks(Maths,computer).Create class student from person and marks.
#Display student details and pass/fail,if 50% is needed for pass.

class Person:
    def __init__(self, name, roll):
        self.name = name
        self.roll = roll
        
class Marks:
    def __init__(self, maths, computer):
        self.maths = maths
        self.computer = computer

class Student(Person, Marks):
    def __init__(self, name, roll, maths, computer):
        Person.__init__(self, name, roll)
        Marks.__init__(self, maths, computer)
    def display(self):
        print(f"Student Name: {self.name}")
        print(f"Roll Number: {self.roll}")
        print(f"Maths Marks: {self.maths}")
        print(f"Computer Marks: {self.computer}")
        total = self.maths + self.computer
        percentage = total / 2
        print(f"Percentage: {percentage}%")
        if percentage >= 50:
            print("Result: Pass")
        else:
            print("Result: Fail")

# Example usage

student1 = Student("John Doe", "A123", 70, 80)
student1.display()
student2 = Student("Jane Smith", "B456", 40, 60)
student2.display()