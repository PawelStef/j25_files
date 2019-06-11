package com.javagda25.files_example_write.Zadanie5;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Data

public class Formularz {
    private String wiek;
    private String wzrost;
    private boolean plec;
    private String zarobki;
    private String kolor;
    private String miejscowosc;

    public Formularz(String wiek, String wzrost, boolean plec, String zarobki, String kolor, String miejscowosc) {
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.plec = plec;
        this.zarobki = zarobki;
        this.kolor = kolor;
        this.miejscowosc = miejscowosc;

        String form ="wiek="+wiek+"\r\n"+"wzrost="+wzrost+"\r\n"+"płeć="+plec+"\r\n"+"zarobki="+zarobki+"\r\n"+"kolor="+kolor+"\r\n"+"miejscowość="+miejscowosc;
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter("output_form.txt", true));

            printWriter.println(form);
            printWriter.println("----------");
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
