package ar.edu.unahur.obj2;

public class DemonioDeFuego extends Demonio{
    @Override
    public void atormentarAlmas() {
        super.atormentarAlmas();
        almasJodidas.forEach(alma -> alma.setEsFriolenta(false));
    }

    public DemonioDeFuego(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public boolean condicionPropia(Alma a1) {
        return a1.getEsFriolenta()==false;
    }
}
