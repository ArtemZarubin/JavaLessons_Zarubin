package Lesson_15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_15_1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Помилка закриття файлу: " + e.getMessage());
                }
            }
        }
    }
}