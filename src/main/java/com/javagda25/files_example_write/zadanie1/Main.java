package com.javagda25.files_example_write.zadanie1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("output_1.txt", true));

            printWriter.println("Hello World!!");
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
