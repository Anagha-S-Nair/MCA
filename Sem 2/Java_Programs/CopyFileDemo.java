// PROGRAM - 26
// write a Java program to perform a copy of a text file.
// The program should read the contents of the source
// file, convert all the text to uppercase and write the
// result into a new destination file. Use Buffered
// InputStream & Buffered OutputStream.

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("file1.txt"));
             BufferedOutputStream out = new BufferedOutputStream(
                new FileOutputStream("file2.txt"))) {

            int data;
            while ((data = in.read()) != -1) {
                out.write((byte) Character.toUpperCase((char) data));
            }

            System.out.println("File copied");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}