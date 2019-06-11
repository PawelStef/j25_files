package com.javagda25.files_example_write.Zadanie5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        wypelnijFormularz();


    }

    public static void wypelnijFormularz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        String wiek = scanner.nextLine();
        System.out.println("Podaj swój wzrost: ");
        String wzrost= scanner.nextLine();
        System.out.println("Podaj płeć: ");
        String plecString= scanner.nextLine();
        boolean plec;
        if (plecString.substring(0,1).equals("m")){
            plec=true;
        }else {plec = false;}
        System.out.println("Podaj swoje zarobki brutto: ");
        String zarobki= scanner.nextLine();
        System.out.println("Podaj ulubiony kolor: ");
        String kolor= scanner.nextLine();
        System.out.println("Podaj miejscowość w której mieszkasz: ");
        String miejscowosc= scanner.nextLine();

        Formularz form = new Formularz(wiek,wzrost,plec,zarobki,kolor,miejscowosc);

    }


}
