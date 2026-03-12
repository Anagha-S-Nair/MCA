#Create a class Flower(name).Add the attribute petalColor at runtime.If the flower has the attribute petalColor then display '<petalColor><name>' else display 'UnknownFlower'.
class Flower:
    def __init__(self, name):
        self.name = name

    def display(self):
        if hasattr(self, 'petalColor'):
            print(f"{self.petalColor} {self.name}")
        else:
            print("UnknownFlower")
# Example usage
flower1 = Flower("Rose")    
flower1.petalColor = "Red"
flower1.display()
flower2 = Flower("Lily")
flower2.display()