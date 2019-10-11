package elte.almasi.mate.lenyek.model;

public abstract class Leny {

    private String nev;
    private int vizMennyiseg;
    private int maxVizMennyiseg;
    private boolean alive = true;
    private int megtettTavolsag = 0; // kezdetben a megtett tavolsag = 0

    public Leny(String nev, int vizMennyiseg) {
        this.nev = nev;
        this.vizMennyiseg = vizMennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getVizMennyiseg() {
        return vizMennyiseg;
    }

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

    public void setMegtettTavolsag(int megtettTavolsag) {
        this.megtettTavolsag += megtettTavolsag;
    }


    public abstract void drink(String nap);

    public abstract void move(String nap);

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
}
