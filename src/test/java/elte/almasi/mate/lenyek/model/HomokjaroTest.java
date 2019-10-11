package elte.almasi.mate.lenyek.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HomokjaroTest {

    public Leny homokjaro = null;

    @Before
    public void setUp() throws Exception {
        homokjaro = new Homokjaro("Homokjaro", 7);
    }

    @Test
    public void vizetVeszitNapos() {
        homokjaro.vizetVeszit("n");
        Assert.assertEquals(6, homokjaro.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitFelhos() {
        homokjaro.vizetVeszit("f");
        Assert.assertEquals(7, homokjaro.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitEsos() {
        homokjaro.vizetVeszit("e");
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