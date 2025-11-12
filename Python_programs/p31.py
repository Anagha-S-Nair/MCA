#Create class Engine(_power) and wheels(_size).Derive the class Car(_model) from Engine and Wheels.Display details of the car using method overriding.
class Engine:
    def __init__(self, power):
        self._power = power
    def display(self):
        print(f"Engine Power: {self._power}")

class Wheels:
    def __init__(self, size):
        self._size = size
    def display(self):
        print(f"Wheels Size: {self._size}")

class Car(Engine, Wheels):
    def __init__(self, _model, _power, _size):
        Engine.__init__(self, _power)
        Wheels.__init__(self, _size)
        self.model = _model
    def display(self):
        print(f"Car Model: {self.model}")
        print(f"Engine Power: {self._power}")
        print(f"Wheels Size: {self._size}")
        
c1 = Car("Toyota Camry", "200 HP", "17 inches")
c1.display()
