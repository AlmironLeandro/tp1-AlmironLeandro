package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DiabolicoTest {

    @BeforeMethod
    public void setUp() {
    }
    @Test
    public void primerTest(){
        //ToDO TEST PARA SABER SI PUEDE CAZAR UNA DETERMINADA ALMA
        Alma a1 = new Alma(false,10,10);
        DemonioDeFuego d1 = new DemonioDeFuego(20);
        assertTrue(d1.puedeCazar(a1));
    }
    @Test
    public void segundoTest(){
        Alma a1 = new Alma(true,22,22);
        DemonioDeFuego d1 = new DemonioDeFuego(20);
        LugarDeAlma Neuquen = new LugarDeAlma();
        Neuquen.agregarAlma(a1);
        d1.cazarAlma(Neuquen);
        assertEquals(1,d1.getAlmasJodidas().stream().count());
        assertEquals(22,a1.getNivelBondad());
        d1.atormentarAlmas();
        assertEquals(17,a1.getNivelBondad());
    }
    @Test
    public void tercerTest(){
        Alma a1 = new Alma(false,10,20);
        Alma a2 = new Alma(true,22,22);
        Alma a3 = new Alma(true,10,5);
        Alma a4 = new Alma(false,15,16);
        Alma a5 = new Alma(true,5,5);
        DemonioDeHielo demon = new DemonioDeHielo(10);
        LugarDeAlma l1 = new LugarDeAlma();
        l1.agregarAlma(a1);
        l1.agregarAlma(a2);
        l1.agregarAlma(a3);
        l1.agregarAlma(a4);
        l1.agregarAlma(a5);
        demon.cazarAlma(l1);
        assertTrue(demon.almasCazadas.contains(l1.getConjuntoDeAlmas()));
    }
}