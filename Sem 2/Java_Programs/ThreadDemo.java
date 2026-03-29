// PROGRAM - 23
// Write a Java program that creates two threads to perform the following tasks concurrently:
// Thread A (extending Thread): Print the squares of numbers from 1 to 10 with a delay of 500 ms between each print.
// Thread B (implementing Runnable): Print the cubes of numbers from 1 to 10 with a delay of 700 ms between each print.
// Main thread must ensure that the message "calculations complete" is only printed after both threads have finished their execution.

class SquareThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Square of " + i + " = " + (i * i));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class CubeThread implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Cube of " + i + " = " + (i * i * i));
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        SquareThread t1 = new SquareThread();
        Thread t2 = new Thread(new CubeThread());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("calculations complete");
    }
}