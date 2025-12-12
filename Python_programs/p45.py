#Create class Book(title,author).Add attribute 'publisher' at runtime. If the attribute 'publisher' is avaliable  in Book object,then print <title> written by <author> is published by <publisher>.Else print 'Unknown publisher'.
class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author

    def print_book_info(self):
        if hasattr(self, 'publisher'):
            print(f"{self.title} written by {self.author} is published by {self.publisher}.")
        else:
            print("Unknown publisher.")
# Example usage
book1 = Book("1984", "George Orwell")
book1.publisher = "Secker & Warburg"
book1.print_book_info()
book2 = Book("To Kill a Mockingbird", "Harper Lee")
book2.print_book_info()