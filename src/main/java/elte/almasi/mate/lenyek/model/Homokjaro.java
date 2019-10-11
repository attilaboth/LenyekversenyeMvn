package elte.almasi.mate.lenyek.model;

public class Homokjaro extends Leny {


    public Homokjaro(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
    }

    @Override
    public void drink(String nap) {
       // System.out.println("Homokjaro ivott");
    }

    @Override
    public void move(String nap) {
        //System.out.println("Homokjaro lepett");
    }

}
