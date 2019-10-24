package ar.edu.unahur.obj2;

public class LuchaMarcialDemoníaca extends Alma{
    Alma a1;

    public LuchaMarcialDemoníaca(boolean esFriolenta, int nivelBondad, int nivelValor, Alma a1) {
        super(esFriolenta, nivelBondad, nivelValor);
        this.a1 = a1;
    }

    @Override
    public int getNivelValor() {
        return nivelValor*2;
    }
}
