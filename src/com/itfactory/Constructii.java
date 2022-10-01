package com.itfactory;

public class Constructii extends Produs{
    private String Constructii;
    private String culoare;

    public Constructii (String nume, double pret, int discount, String culoare){
        super(nume, pret, discount);
        this.culoare = culoare;
    }
    public void afiseazaDateConstructii(){
        System.out.println("Date constructii: " +
                "\n nume " + this.getNume() +
                "\n pret " + this.getPret() +
                "\n discount " + this.getDiscount());
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
