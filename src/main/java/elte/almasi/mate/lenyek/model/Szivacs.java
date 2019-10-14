package elte.almasi.mate.lenyek.model;

public class Szivacs extends Leny {

    public Szivacs(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
        setMaxVizMennyiseg(20);
    }

    /**
     * A Lenyre specifikus viz valtozas definialasa
     * @param nap
     */
    @Override
    public void vizMennyisegValtozas(String nap) {
        switch (nap.toLowerCase()) {
            case "n":
                //System.out.println("Szivacs ivott NAPOS napon");
                setVizMennyiseg(-4);
                break;
            case "f":
               // System.out.println("Szivacs ivott FELHŐS napon");
                setVizMennyiseg(-1);
                break;
            case "e":
               // System.out.println("Szivacs ivott ESŐS napon");
                setVizMennyiseg(6);
                break;
            default:
        }
    }

    /**
     * A Lenyre specifikus elmozdulas definialasa
     * @param nap
     */
    @Override
    public void elmozdul(String nap) {
        switch (nap.toLowerCase()) {
            case "n":
                //System.out.println("Szivacs mozgott NAPOS napon");
                setMegtettTavolsag(0);
                break;
            case "f":
                //System.out.println("Szivacs mozgott FELHŐS napon");
                setMegtettTavolsag(1);
                break;
            case "e":
                //System.out.println("Szivacs mozgott ESŐS napon");
                setMegtettTavolsag(3);
                break;
            default:
        }
    }
}
