package elte.almasi.mate.lenyek.model;

public abstract class Leny implements Comparable<Leny>{

    private String nev;
    private int vizMennyiseg;
    private int maxVizMennyiseg;
    private boolean alive = true;
    private int megtettTavolsag;

    public Leny(String nev, int vizMennyiseg) {
        this.nev = nev;
        this.vizMennyiseg = vizMennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public int getVizMennyiseg() {
        return vizMennyiseg;
    }

    /**
     * A vizmennyiseg valtozasank szamolasa.
     * Ha elfogy a viz menniyseg akkor alive boolean flag false lesz
     * Ha a vizmennyiseg merteke eleri a fajra jellemzo maximumot, akkor
     * az lesz a vizmennyiseg erteke.
     * @param vizMennyiseg
     */
    public void setVizMennyiseg(int vizMennyiseg) {
        this.vizMennyiseg += vizMennyiseg;
        if(getVizMennyiseg() <= 0){
            setAlive(false);
        }
        if(getVizMennyiseg() >= getMaxVizMennyiseg()){
            this.vizMennyiseg = getMaxVizMennyiseg();
        }
    }

    public int getMaxVizMennyiseg() {
        return maxVizMennyiseg;
    }

    public void setMaxVizMennyiseg(int maxVizMennyiseg) {

        this.maxVizMennyiseg = maxVizMennyiseg;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getMegtettTavolsag() {
        return megtettTavolsag;
    }

    public void setMegtettTavolsag(int tavolsag) {
        this.megtettTavolsag += tavolsag;
    }

    /**
     * A viz mennyisegenek valtozasa. Lehet + es - iranyu is
     * @param nap
     */
    public abstract void vizMennyisegValtozas(String nap);

    /**
     * elmozdulas metodusa
     * @param nap
     */
    public abstract void elmozdul(String nap);

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Leny{");
        sb.append("nev='").append(nev).append('\'');
        sb.append(", vizMennyiseg=").append(vizMennyiseg);
        sb.append(", maxVizMennyiseg=").append(maxVizMennyiseg);
        sb.append(", alive=").append(alive);
        sb.append(", megtettTavolsag=").append(megtettTavolsag);
        sb.append('}');
        return sb.toString();
    }

    /**
     * A vegeredmeny sorbarendezese a megtett tavolsag szerint.
     * A lista legelso eleme lesz legnagyobb megtett tavolsag szerint
     * @param leny
     * @return
     */
    @Override
    public int compareTo(Leny leny) {
        return  leny.getMegtettTavolsag() - this.getMegtettTavolsag();
    }
}
