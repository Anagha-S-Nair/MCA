#Create a class FruitBasket(fruit_name,price per_kg).Overload '+' operator that adds two fruits baskets with unique fruits having the least price from 2 baskets.
# Create class FruitBasket(fruit_name,priceperkg). Overload ‘+’ operator that adds two fruit baskets with unique fruits having least price from 2 baskets.

class FruitBasket:
    def __init__(self, fruit_name, price_per_kg):
        self.fruit = fruit_name
        self.price = price_per_kg

    def __add__(self, other):
        # If both baskets contain the SAME fruit
        if self.fruit == other.fruit:
            # Return the fruit with the lowest price
            lowest_price = min(self.price, other.price)
            return FruitBasket(self.fruit, lowest_price)

        # If fruits are DIFFERENT → return both as a list
        else:
            return [
                FruitBasket(self.fruit, self.price),
                FruitBasket(other.fruit, other.price)
            ]

    def display(self):
        print(f"{self.fruit} : Rs.{self.price}/kg")