package com.javagda25.files_example_write.zadanie3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try(PrintWriter printWriter = new PrintWriter(new FileWriter("output_3.txt", true));) {
            String quit = "";
            while (!quit.equals("quit")){
                System.out.println("Dopisz coś do pliku");
                printWriter.println(scanner.nextLine());
                System.out.println("By zakończyć wpisz 'quit'");
                quit=scanner.nextLine();

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
