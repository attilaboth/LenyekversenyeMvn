package elte.almasi.mate.lenyek.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LepegetoTest {

    public Leny lepegeto = null;

    @Before
    public void setUp() throws Exception {
        lepegeto = new Lepegeto("Lepegeto", 11);
    }

    @Test
    public void vizetVeszitNapos() {
        lepegeto.vizetVeszit("n");
        Assert.assertEquals(9, lepegeto.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitFelhos() {
        lepegeto.vizetVeszit("f");
        Assert.assertEquals(10, lepegeto.getVizMennyiseg());
    }

    @Test
    public void vizetVeszitEsos() {
        lepegeto.vizetVeszit("e");
        Assert.assertEquals(12, lepegeto.getVizMennyiseg());
    }

    @Test
    public void elmozdulNapos() {
        lepegeto.elmozdul("n");
        Assert.assertEquals(1, lepegeto.getMegtettTavolsag());
    }

    @Test
    public void elmozdulFelhos() {
        lepegeto.elmozdul("f");
        Assert.assertEquals(2, lepegeto.getMegtettTavolsag());
    }

    @Test
    public void elmozdulEsos() {
        lepegeto.elmozdul("e");
        Assert.assertEquals(1, lepegeto.getMegtettTavolsag());
    }

}