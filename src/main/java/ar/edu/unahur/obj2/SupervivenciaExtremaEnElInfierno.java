package ar.edu.unahur.obj2;

public class SupervivenciaExtremaEnElInfierno extends Alma {
    public Alma a1;

    public SupervivenciaExtremaEnElInfierno(Alma a1) {
        this.a1 = a1;
    }

    public Alma getA1() {
        return a1;
    }

    @Override
    public boolean esFrioleanta() {
        return false;
    }
}
