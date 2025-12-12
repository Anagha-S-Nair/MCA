#Find the sum of even valued terms in a fibonacci series.
def sum_even_fibonacci(limit):
    a, b = 0, 1
    total=0
    while a < limit:
        if a % 2 == 0:
            total += a
        a, b = b, a + b
    return total
limit=int(input("Enter the limit: "))
result = sum_even_fibonacci(limit)
print(f"Sum of even valued terms in Fibonacci series up to {limit} is: {result}")