package com.example.puste;

import java.util.ArrayList;

public class Pytanie {
    private String tresc;
    private int idObrazka;
    private ArrayList<String> odpowiedzi;
    private String podpowiedz;
    private String odpowiedz;
//Constructor
    public Pytanie(String tresc, int idObrazka, ArrayList<String> odpowiedzi, String podpowiedz, String odpowiedz) {
        this.tresc = tresc;
        this.idObrazka = idObrazka;
        this.odpowiedzi = odpowiedzi;
        this.podpowiedz = podpowiedz;
        this.odpowiedz = odpowiedz;
    }
//Setteru
    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public void setOdpowiedzi(ArrayList<String> odpowiedzi) {
        this.odpowiedzi = odpowiedzi;
    }

    public void setPodpowiedz(String podpowiedz) {
        this.podpowiedz = podpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }
//Gettery
    public String getTresc() {
        return tresc;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public ArrayList<String> getOdpowiedzi() {
        return odpowiedzi;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

}
