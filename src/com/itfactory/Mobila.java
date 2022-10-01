package com.itfactory;

public class Mobila extends Produs{
    private String Mobila;
    private String material;

    public Mobila (String nume, double pret, int discount, String material){
        super(nume, pret, discount);
        this.material = material;
    }
    protected void afiseazaDateMobila(){
        System.out.println("Date mobila: " +
                "\n nume " + this.getNume() +
                "\n pret " + this.getPret() +
                "\n material " + this.material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
