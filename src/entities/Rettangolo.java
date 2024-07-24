package entities;

public class Rettangolo {

    //ATTRIBUTI
    private double base;
    private double altezza;

    //COSTRUTTORI
    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public static void stampaRettangolo(Rettangolo r) {
        System.out.println("il perimetro del primo rettangolo è: " + r.getPerimeter());
        System.out.println("l'area del primo rettangolo è: " + r.getArea());
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("il perimetro del secondo rettangolo è: " + r1.getPerimeter());
        System.out.println("l'area del secondo rettangolo è: " + r1.getArea());
        System.out.println("il perimetro del terzo rettangolo è: " + r2.getPerimeter());
        System.out.println("l'area del terzo rettangolo è: " + r2.getArea());
    }

    //METODI
    private double getPerimeter() {
        return this.altezza * 2 + this.base * 2;
    }

    private double getArea() {
        return base * altezza;
    }
}
