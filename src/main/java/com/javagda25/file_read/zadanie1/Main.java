package com.javagda25.file_read.zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;

        File plik = new File("output_1.txt");
        if (plik.exists()) {

            try {
                scanner = new Scanner(new FileReader("output_1.txt"));

                if (!scanner.hasNextLine()) {
                    System.out.println("brak treeści");

                }

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.equals("Hello World!!")) {
                        System.out.println(line);
                    } else {
                        System.out.println("inna treść");
                    }
                }


            } catch (FileNotFoundException e) {
                e.getLocalizedMessage();
            }
        }else{
            System.out.println("brak pliku");
        }
    }
}
