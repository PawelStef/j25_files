package com.javagda25.file_read.Excample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainBufferedReader {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("nazwa.txt"));
            String linia;

            while ((linia = reader.readLine()) != null) {
//                String[] slowa = linia.split("%==%");
//                System.out.println(slowa[1]);
                System.out.println(linia);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
