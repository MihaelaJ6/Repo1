package com.itfactory;

public class Electrocasnice extends Produs{
    private int voltaj;
    private String Electrocasnice;

    public Electrocasnice (String nume, double pret, int discount, int voltaj){
        super(nume, pret, discount);
            this.voltaj = voltaj;
    }
    protected void dateElectrocasnice(){
        System.out.println("Datele produsului: " +
                "\n nume " + this.getNume() +
                "\n pret " + this.getPret() +
                "\n voltaj " + this.voltaj);
    }
    public int getVoltaj(){
        return voltaj;
    }
    public void setVoltaj(int voltaj){
        this.voltaj = voltaj;
    }
}

