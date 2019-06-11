package com.javagda25.file_read.zadanie5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        int formNumber=0;

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

                    }
                    formNumber++;
                }
                scanner.close();


            } catch (FileNotFoundException e) {
                e.getLocalizedMessage();
            }
        }else{
            System.out.println("brak pliku");
        }

        System.out.println("Ilość formularzy: "+formNumber);

    }
}

