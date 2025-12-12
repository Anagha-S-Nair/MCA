#Create a class currency(amount,unit).Overload the '==' operator to determine if two currencies are equal.
class Currency:
    def __init__(self, amount, unit):
        self.amount = amount
        self.unit = unit

    def __eq__(self, other):
            return (self.amount == other.amount) and (self.unit == other.unit)

# Example usage
currency1 = Currency(100, "USD")
currency2 = Currency(100, "INR")
currency3 = Currency(200, "USD")
print(currency1 == currency2)  
print(currency1 == currency3)  