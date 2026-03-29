// PROGRAM - 25
// create an Account class with a balance attribute. Allow
// 2 users to access the shared account, where one user
// deposits to the account and the other user withdraws
// money. Write a program that allows concurrent account transactions.

class Account {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public synchronized int getBalance() {
        return balance;
    }
}

class Depositor implements Runnable {
    private Account account;

    public Depositor(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(200);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Withdrawer implements Runnable {
    private Account account;

    public Withdrawer(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(150);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        Account sharedAccount = new Account();

        Thread depositorThread = new Thread(new Depositor(sharedAccount));
        Thread withdrawerThread = new Thread(new Withdrawer(sharedAccount));

        depositorThread.start();
        withdrawerThread.start();

        try {
            depositorThread.join();
            withdrawerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + sharedAccount.getBalance());
    }
}