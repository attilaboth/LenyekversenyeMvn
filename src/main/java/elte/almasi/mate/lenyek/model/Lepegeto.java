package elte.almasi.mate.lenyek.model;

public class Lepegeto extends Leny {

    public Lepegeto(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
        setMaxVizMennyiseg(12);

    }

    /**
     * A Lenyre specifikus viz valtozas definialasa
     * @param nap
     */
    @Override
    public void vizMennyisegValtozas(String nap) {
        switch (nap.toLowerCase()) {
            case "n":
               // System.out.println("Lepegeto ivott NAPOS napon");
                setVizMennyiseg(-2);
                break;
            case "f":
                //System.out.println("Lepegeto ivott FELHŐS napon");
                setVizMennyiseg(-1);
                break;
            case "e":
                //System.out.println("Lepegeto ivott ESŐS napon");
                setVizMennyiseg(3);
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
                //System.out.println("Lepegeto mozgott NAPOS napon");
                setMegtettTavolsag(1);
                break;
            case "f":
               // System.out.println("Lepegeto mozgott FELHŐS napon");
                setMegtettTavolsag(2);
                break;
            case "e":
               // System.out.println("Lepegeto mozgott ESŐS napon");
                setMegtettTavolsag(1);
                break;
            default:
        }
    }

}
