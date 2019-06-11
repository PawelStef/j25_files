package com.javagda25.files_example_write.zadanie4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj plik:");

        File plik = new File(scanner.nextLine());
        System.out.println();
        System.out.println(plik.getAbsolutePath());
        System.out.println("Plik istnieje: " + plik.exists());
        System.out.println("Plik jest katalogiem: " + plik.isDirectory());
        System.out.println("Rozmiar pliku: " + plik.length());
        Timestamp timestamp = new Timestamp(plik.lastModified());
        LocalDateTime modyfied = LocalDateTime.from(timestamp.toLocalDateTime());
        System.out.println("Czas ostatniej modyfikacji: " + modyfied);
        System.out.println("Prawo do zapisu: " + plik.canWrite());
        System.out.println("Prawo do odczytu: " + plik.canRead());




        try(PrintWriter printWriter = new PrintWriter(new FileWriter("output_2.txt", true));) {

            printWriter.println(scanner.nextLine());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
