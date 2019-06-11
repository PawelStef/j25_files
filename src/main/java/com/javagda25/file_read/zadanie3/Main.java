package com.javagda25.file_read.zadanie3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;

        File plik = new File("output_3.txt");
        int lines =0;
        int wards =0;

        if (plik.exists()) {

            try {
                scanner = new Scanner(new FileReader("output_3.txt"));

                if (!scanner.hasNextLine()) {
                    System.out.println("brak treeści");

                }

                while (scanner.hasNextLine()) {
                    lines++;
                    String line = scanner.nextLine();
                    String[] lineTab= line.split(" ");
                    wards=wards+lineTab.length;

                }


            } catch (FileNotFoundException e) {
                e.getLocalizedMessage();
            }
        }else{
            System.out.println("brak pliku");
        }

        System.out.println("linie:  "+lines+", słowa: " +
                wards);

    }
}
