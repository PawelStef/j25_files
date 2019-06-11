package com.javagda25.file_read.zadanie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;

        File plik = new File("output_2.txt");
        if (plik.exists()) {

            try {
                scanner = new Scanner(new FileReader("output_2.txt"));

                if (!scanner.hasNextLine()) {
                    System.out.println("brak treeści");

                }

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line.toUpperCase());
                    System.out.println(line.toLowerCase());
                    System.out.println(line.trim());

                }


            } catch (FileNotFoundException e) {
                e.getLocalizedMessage();
            }
        }else{
            System.out.println("brak pliku");
        }

    }
}
