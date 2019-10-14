package elte.almasi.mate.lenyek.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomokjaroTest {

    public Leny homokjaro = null;

    @Before
    public void setUp() throws Exception {
        homokjaro = new Homokjaro("Homokjaro", 7);
    }

    @Test
    public void vizetVeszitNapos() {
        homokjaro.vizMennyisegValtozas("n");
        Assert.assertEquals(6, homokjaro.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitFelhos() {
        homokjaro.vizMennyisegValtozas("f");
        Assert.assertEquals(7, homokjaro.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitEsos() {
        homokjaro.vizMennyisegValtozas("e");
        Assert.assertEquals(8, homokjaro.getVizMennyiseg());
    }


    @Test
    public void elmozdulNapos() {
        homokjaro.elmozdul("n");
        Assert.assertEquals(3, homokjaro.getMegtettTavolsag());
    }

    @Test
    public void elmozdulFelhos() {
        homokjaro.elmozdul("f");
        Assert.assertEquals(1, homokjaro.getMegtettTavolsag());
    }

    @Test
    public void elmozdulEsos() {
        homokjaro.elmozdul("e");
        Assert.assertEquals(0, homokjaro.getMegtettTavolsag());
    }

}