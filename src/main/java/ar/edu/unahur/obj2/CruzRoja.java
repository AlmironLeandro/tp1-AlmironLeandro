package ar.edu.unahur.obj2;

public class CruzRoja extends Alma {
    public Alma a1;

    public Alma getA1() {
        return a1;
    }

    public CruzRoja(Alma a1) {
        this.a1 = a1;
    }
    @Override
    public void setValor(int valor1) {
        if(valor1<=100){
            valor=100;
        }
        else {
            valor=valor1;
        }
    }
}
