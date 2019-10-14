package elte.almasi.mate.lenyek.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SzivacsTest {

    public Leny szivacs = null;

    @Before
    public void setUp() throws Exception {
        szivacs = new Szivacs("Szivacs", 16);
    }

    @Test
    public void vizetVeszitNapos() {
        szivacs.vizMennyisegValtozas("n");
        Assert.assertEquals(12, szivacs.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitFelhos() {
        szivacs.vizMennyisegValtozas("f");
        Assert.assertEquals(15, szivacs.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitEsos() {
        szivacs.vizMennyisegValtozas("e");
        Assert.assertEquals(20, szivacs.getVizMennyiseg());
    }

    @Test
    public void elmozdulNapos() {
        szivacs.elmozdul("n");
        Assert.assertEquals(0, szivacs.getMegtettTavolsag());
    }

    @Test
    public void elmozdulFelhos() {
        szivacs.elmozdul("f");
        Assert.assertEquals(1, szivacs.getMegtettTavolsag());
    }

    @Test
    public void elmozdulEsos() {
        szivacs.elmozdul("e");
        Assert.assertEquals(3, szivacs.getMegtettTavolsag());
    }

}