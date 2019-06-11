package com.javagda25.file_read.zadanie6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        int formNumber = 0;
        int menAgeSum = 0;
        int womenAgeSum = 0;
        int ageSum = 0;
        int menNumber = 0;
        int womenNumber = 0;
        int menHightSum = 0;
        int womenHightSum = 0;
        int womenSalarySum = 0;
        int menSalarySum = 0;

        File plik = new File("output_form.txt");
        if (plik.exists()) {

            try {
                scanner = new Scanner(new FileReader("output_form.txt"));

                if (!scanner.hasNextLine()) {
                    System.out.println("brak treści");
                }

                while (scanner.hasNextLine()) {
                    int currentAge=0;
                    int currentHight=0;
                    int currentSalary=0;
                    boolean currentSex=false;
                    String color="";
                    String pleace="";

                    for (int i = 0; i < 7; i++) {
                        String line = scanner.nextLine();
                        String[] lineTab = line.split("=");

                        switch (lineTab[0]) {
                            case "wiek":
                                currentAge = Integer.parseInt(lineTab[1]);
                                break;
                            case "wzrost":
                                currentHight = Integer.parseInt(lineTab[1]);
                                break;
                            case "płeć":
                                currentSex = Boolean.parseBoolean(lineTab[1]);
                                break;
                            case "zarobki":
                                currentSalary = Integer.parseInt(lineTab[1]);
                                break;
                            case "kolor":
                                color = lineTab[1];
                                break;
                            case "miejscowość":
                                pleace = lineTab[1];
                                break;
                            default:
                                continue;
                        }


                    }
                    formNumber++;
                    ageSum +=currentAge;
                    if (currentSex){
                        menAgeSum+=currentAge;
                        menHightSum+=currentHight;
                        menNumber++;
                        menSalarySum+=currentSalary;
                    }else{
                        womenAgeSum+=currentAge;
                        womenHightSum+=currentHight;
                        womenNumber++;
                        womenSalarySum+=currentSalary;
                    }
                }
                scanner.close();


            } catch (FileNotFoundException e) {
                e.getLocalizedMessage();
            }
        } else {
            System.out.println("brak pliku");
        }

        System.out.println("Ilość formularzy: " + formNumber);
        System.out.println("średni wiek kobiet: " + womenAgeSum/womenNumber);
        System.out.println("średni wiek mężczyzn: " + menAgeSum/menNumber);
        System.out.println("średni wiek : " + ageSum/formNumber);
        System.out.println("ilość kobiet : " + womenNumber);
        System.out.println("ilość mążczyzn : " + menNumber);
        double avNum=(double) womenNumber /(double) menNumber;
        System.out.println("proporcja ilości kobiet/mężczyzn : " + avNum);
        System.out.println("średni wzrost kobiet : " + womenHightSum/womenNumber);
        System.out.println("średni wzrost mężczyzn : " + menHightSum/menNumber);
        System.out.println("średnie zarobki kobiet : " + womenSalarySum/womenNumber);
        System.out.println("średnie zarobki mężczyzn : " + menSalarySum/menNumber);



    }
}

