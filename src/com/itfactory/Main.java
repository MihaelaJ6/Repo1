package com.itfactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mobila dulap = new Mobila("dulap", 2540.99, 20, "lemn");
        Mobila canapea = new Mobila("canapea", 1298.50,30, "piele");
        Mobila masa = new Mobila("masa", 250, 5, "sticla");
        Electrocasnice mixer = new Electrocasnice("mixer", 130.99, 0, 220);
        Electrocasnice frigider = new Electrocasnice("frigider", 3045, 25, 240);
        Electrocasnice aspirator = new Electrocasnice("aspirator", 620.99, 5, 250);
        Gradina roaba = new Gradina("roaba", 120.99, 10, 1);
        Gradina flori = new Gradina("flori", 30.50, 0, 12);
        Gradina manusiGradinarit = new Gradina("manusiGradinarit", 25, 5, 2);
        Constructii gresie = new Constructii("gresie", 15.99, 10, "albastru");
        Constructii faianta = new Constructii("faianta", 23.99, 15, "alb");
        Constructii tigla = new Constructii("tigla", 25.99, 10, "rosu");
        System.out.println("Alegeti optiunea dorita:" +
                "\n 1.Mobila" +
                "\n 2.Electrocasnice" +
                "\n 3.Gradina" +
                "\n 4.Constructii");
        String tipProdus = scanner.nextLine();
        System.out.println("Tipul produsului este: " + tipProdus);
        switch (tipProdus.toUpperCase()){
            case "MOBILA":{
                dulap.afiseazaDateMobila();
                canapea.afiseazaDateMobila();
                masa.afiseazaDateMobila();
                String tipMobila = scanner.nextLine();
                System.out.println("Tipul de moblia ales este: " + tipMobila);
                if(tipMobila.equalsIgnoreCase(dulap.getNume())) {
                    System.out.println("Pretul final al produsului " + tipMobila + " este " + dulap.pretFinal());
                } else {
                    if(tipMobila.equalsIgnoreCase(canapea.getNume())){
                        System.out.println("Pretul final al produsului " + tipMobila + " este " + canapea.pretFinal());
                    } else {
                        if(tipMobila.equalsIgnoreCase(masa.getNume())){
                            System.out.println("Pretul final al produsului " + tipMobila + " este " + masa.pretFinal());
                        }
                    }
                }
                break;
            }
            case "ELECTROCASNICE":{
                mixer.dateElectrocasnice();
                frigider.dateElectrocasnice();
                aspirator.dateElectrocasnice();
                System.out.println("Alegeti produsul dorit.");
                String produs = scanner.nextLine();
                System.out.println("Produsul ales este: " + produs);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Alegeti voltajul dorit: " +
                        "\n 1. 220 - 240 " +
                        "\n 2. Altul ");
                int x = Integer.parseInt(scanner1.nextLine());
                switch (x){
                    case 1:
                        System.out.println("Voltajul este conform cu reglemantarile in vigoare.");
                        break;
                    case 2:
                        System.out.println("Voltajul nu este in conformitate cu regelmentarile europene.");
                        break;
                }
                break;
            }
            case "GRADINA":{
                roaba.afiseazaDateGradina();
                flori.afiseazaDateGradina();
                manusiGradinarit.afiseazaDateGradina();
                System.out.println("Alegeti produsul dorit: ");
                String obiecteGradina = scanner.nextLine();
                System.out.println("Produsul ales este: " + obiecteGradina);
                if(obiecteGradina.equalsIgnoreCase(roaba.getNume())) {
                    System.out.println("Pretul final al produsului " + obiecteGradina + " este " + roaba.pretFinal());
                } else {
                    if(obiecteGradina.equalsIgnoreCase(flori.getNume())){
                        System.out.println("Pretul final al produsului " + obiecteGradina + " este " + flori.pretFinal());
                    } else {
                        if (obiecteGradina.equalsIgnoreCase(manusiGradinarit.getNume())) {
                            System.out.println("Pretul final al produsului " + obiecteGradina + " este " + manusiGradinarit.pretFinal());
                        }
                    }
                    }
                break;
            }
            case "CONSTRUCTII":{
                System.out.println("Alegeti produsul dorit: ");
                gresie.afiseazaDateConstructii();
                faianta.afiseazaDateConstructii();
                tigla.afiseazaDateConstructii();
                String materialeConstructii = scanner.nextLine();
                System.out.println("Produsul ales este: " + materialeConstructii);
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Alegeti culoarea dorita: " +
                        "\n 1. rosu" +
                        "\n 2. alb" +
                        "\n 3. albastru");
                int x = Integer.parseInt(scanner2.nextLine());
                switch (x){
                    case 1:
                        System.out.println("Culoarea aleasa este disponibila. ");
                        break;
                    case 2:
                        System.out.println("Culoarea aleasa nu este disponibila. Va rugam selectati alta culoare.");
                        break;
                    case 3:
                        System.out.println("Culoarea aleasa este disponibila.");
                        break;
                }
                break;
            }
        }

    }
}
