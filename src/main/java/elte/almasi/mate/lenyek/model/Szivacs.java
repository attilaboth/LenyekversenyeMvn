package elte.almasi.mate.lenyek.model;

public class Szivacs extends Leny {

    public Szivacs(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
        setMaxVizMennyiseg(20);
    }

    @Override
    public void drink(String nap) {
        switch (nap.toLowerCase()) {
            case "n":
                System.out.println("Szivacs ivott NAPOS napon");
                setVizMennyiseg(-4);
                break;
            case "f":
                System.out.println("Szivacs ivott FELHŐS napon");
                setVizMennyiseg(-1);
                break;
            case "e":
                System.out.println("Szivacs ivott ESŐS napon");
                setVizMennyiseg(6);
                break;
            default:
        }
    }

    @Override
    public void move(String nap) {
        switch (nap.toLowerCase()) {
            case "n":
                System.out.println("Szivacs mozgott NAPOS napon");
                setMegtettTavolsag(0);
                break;
            case "f":
                System.out.println("Szivacs mozgott FELHŐS napon");
                setMegtettTavolsag(1);
                break;
            case "e":
                System.out.println("Szivacs mozgott ESŐS napon");
                setMegtettTavolsag(3);
                break;
            default:
        }
    }
}
