package ar.edu.unahur.obj2;

public class LuchaMarcialDemoniaca extends Alma{
    public Alma a1;

    public LuchaMarcialDemoniaca(Alma a1) {
        this.a1 = a1;
    }

    public Alma getA1() {
        return a1;
    }

    @Override
    public int getValor() {
        return a1.getValor() * 2;
    }
}
