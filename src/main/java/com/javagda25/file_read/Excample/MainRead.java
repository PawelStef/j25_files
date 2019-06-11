package com.javagda25.file_read.Excample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MainRead {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("nazwa.txt"));

            while (scanner.hasNextLine()) {
                String linia = scanner.nextLine();
                System.out.println(linia);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
