package elte.almasi.mate.lenyek.model;

public class Szivacs extends Leny {


    public Szivacs(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
    }

    @Override
    public void drink() {
        System.out.println("Szivacs ivott");
    }

    @Override
    public void move() {
        System.out.println("Szivacs mozgott");
    }
}
