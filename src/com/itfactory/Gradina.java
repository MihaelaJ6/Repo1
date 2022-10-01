package com.itfactory;

public class Gradina extends Produs{
    private String Gradina;
    private int cantitate;

    public Gradina (String nume, double pret, int discount, int cantitate){
        super(nume, pret, discount);
        this.cantitate = cantitate;
    }
    public void afiseazaDateGradina(){
        System.out.println("Date gradina: " +
                "\n nume " + this.getNume() +
                "\n pret " + this.getPret() +
                "\n discount " + this.getDiscount());
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
}

