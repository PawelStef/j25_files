package com.javagda25.files_example_write.write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainFileWriter {
    public static void main(String[] args) {
        // mój pierwszy print writer
//        try {
//            PrintWriter printWriter = new PrintWriter("katalog/nazwa.txt");
//
//            printWriter.println("hello!");
//
//            printWriter.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        // print writer z funkcją dopisywania
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("katalog/nazwa.txt", true));

            printWriter.println("hello!");

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
