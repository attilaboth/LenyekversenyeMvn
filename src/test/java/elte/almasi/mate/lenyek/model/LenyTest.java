package elte.almasi.mate.lenyek.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LenyTest {

    private Leny leny = null;

    @Before
    public void setUp() throws Exception {
        leny = new Szivacs("Szivacs", 12);
    }

    @Test
    public void drinkNapos() {
        leny.vizetVeszit("n");
        Assert.assertEquals(8, leny.getVizMennyiseg());
    }

    @Test
    public void moveNapos() {
        leny.vizetVeszit("n");
        Assert.assertEquals(0, leny.getMegtettTavolsag());
    }


}