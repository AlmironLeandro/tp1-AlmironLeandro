package ar.edu.unahur.obj2;

public class DemonioDeHielo extends Demonio {

    public DemonioDeHielo(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public void atormentarAlmas() {
        super.atormentarAlmas();
        almasJodidas.forEach(alma -> alma.setEsFriolenta(true));
    }

    @Override
    public boolean condicionPropia(Alma a1) {
        return a1.getEsFriolenta()==true;
    }
}
