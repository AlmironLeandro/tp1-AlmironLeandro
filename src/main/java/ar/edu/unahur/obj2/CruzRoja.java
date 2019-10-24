package ar.edu.unahur.obj2;

public class CruzRoja extends Alma{
    Alma a1;

    public CruzRoja(Alma a1) {
        this.a1 = a1;
    }

    public Alma getA1() {
        return a1;
    }
    //ToDo revisar si es mejor un setter o un getter para este problema.
    // Cruz roja: si se une a la cruz roja, el alma siempre va a tener como mínimo 100 de bondad.
    @Override
    public int getNivelBondad() {
        if(nivelBondad<100){return nivelBondad=100;}
        else {return nivelBondad;}
    }

}
