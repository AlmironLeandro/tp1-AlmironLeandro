package ar.edu.unahur.obj2;

public class SupervivenciaExtremaEnElInfierno extends Alma {
    Alma a1;

    public SupervivenciaExtremaEnElInfierno(boolean esFriolenta, int nivelBondad, int nivelValor, Alma a1) {
        super(esFriolenta, nivelBondad, nivelValor);
        this.a1 = a1;
    }
    @Override
    public boolean getEsFriolenta() {
        return false;
    }
}
