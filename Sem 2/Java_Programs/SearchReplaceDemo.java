// PROGRAM - 27
// write a Java program to perform a "search and replace" operation on a text file.
// The program should read lines from the file, find the word to search and
// replace with the new word and write to a second file. Give number of replacements made.

import java.io.*;

public class SearchReplaceDemo {
    public static void main(String[] args) {
        String search = "file1";
        String replace = "file2";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                int occurrences = 0;
                int index = 0;

                while ((index = line.indexOf(search, index)) != -1) {
                    occurrences++;
                    index += search.length();
                }

                count += occurrences;

                line = line.replace(search, replace);
                bw.write(line);
                bw.newLine();
            }

            System.out.println("Total Replacements made: " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}