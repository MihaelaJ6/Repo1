package com.itfactory;

public class Produs {
    private String nume;
    private double pret;
    private int discount;

    public Produs (String nume, double pret, int discount){
        this.nume = nume;
        this.pret = pret;
        this.discount = discount;
    }
    protected void dateProdus(){
        System.out.println("Datele produsului: " +
                        "\n nume " + this.nume +
                        "\n pret " + this.pret );
    }
    private double Produs(){
        if(discount >= 0 && discount <= 100){
            System.out.println(discount);
        }
        return discount;
    }
    public double pretFinal(){
        return pret - (pret * (discount/100));
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
