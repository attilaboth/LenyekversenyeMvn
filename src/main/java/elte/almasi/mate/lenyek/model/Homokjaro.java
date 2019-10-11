package elte.almasi.mate.lenyek.model;

public class Homokjaro extends Leny {

    public Homokjaro(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
        setMaxVizMennyiseg(8);
    }

    @Override
    public void vizetVeszit(String nap) {
        switch (nap.toLowerCase()) {
            case "n":
                //System.out.println("Homokjaro ivott NAPOS napon");
                setVizMennyiseg(-1);
                break;
            case "f":
                //System.out.println("Homokjaro ivott FELHŐS napon");
                setVizMennyiseg(0);
                break;
            case "e":
               // System.out.println("Homokjaro ivott ESŐS napon");
                setVizMennyiseg(3);
                break;
            default:
        }
    }

    @Override
    public void elmozdul(String nap) {
        switch (nap.toLowerCase()) {
            case "n":
                //System.out.println("Homokjaro mozgott NAPOS napon");
                setMegtettTavolsag(3);
                break;
            case "f":
                //System.out.println("Homokjaro mozgott FELHŐS napon");
                setMegtettTavolsag(1);
                break;
            case "e":
               // System.out.println("Homokjaro mozgott ESŐS napon");
                setMegtettTavolsag(0);
                break;
            default:
        }
    }
}
