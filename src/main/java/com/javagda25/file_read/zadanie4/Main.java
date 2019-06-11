package com.javagda25.file_read.zadanie4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;

        File plik = new File("output_form.txt");
        if (plik.exists()) {

            try {
                scanner = new Scanner(new FileReader("output_form.txt"));

                if (!scanner.hasNextLine()) {
                    System.out.println("brak treści");
                }

                while (scanner.hasNextLine()) {
                    for (int i = 0; i <7 ; i++) {
                        String line = scanner.nextLine();
                        System.out.println(line);
                    }
                }
                scanner.close();


            } catch (FileNotFoundException e) {
                e.getLocalizedMessage();
            }
        }else{
            System.out.println("brak pliku");
        }

    }
}
