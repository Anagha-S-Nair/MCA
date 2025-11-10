#create a bank account with members account number, balance, account type and balance.write constructor and methods to deposit at the bank and withdraw an amount from the bank.
class BankAccount:
    def __init__(self,acc_no,name,acc_type,balance=0):
        self.acc_no=acc_no
        self.name=name
        self.acc_type=acc_type
        self.balance=balance
    def deposit(self,amount):
        if amount>0:
            self.balance+=amount
            print(f" ₹ {amount} deposited successfully.")
        else:
            print("Deposit amount must be positive.")
    def withdraw(self,amount):
        if amount>self.balance:
            print("Insufficient balance.")  
        elif amount<=0:
            print("Withdrawal amount must be positive.")
        else:
            self.balance-=amount
            print(f" ₹ {amount} withdrawn successfully.")
    def display(self):
        print(f"Account Number: {self.acc_no}")
        print(f"Name: {self.name}")
        print(f"Account Type: {self.acc_type}")
        print(f"Balance: ₹ {self.balance}")
acc1=BankAccount("123456","Anagha","Savings",5000)
acc1.display()
acc1.deposit(1500)
acc1.withdraw(2000)
acc1.withdraw(6000)
acc1.display()