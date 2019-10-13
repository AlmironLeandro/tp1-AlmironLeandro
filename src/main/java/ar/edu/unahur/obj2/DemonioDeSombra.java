package ar.edu.unahur.obj2;

public class DemonioDeSombra  extends Demonio{


    public DemonioDeSombra(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    @Override
    public void atormentarAlmas() {
        super.atormentarAlmas();
        almasJodidas.forEach(alma -> alma.setNivelValor(alma.getNivelValor()/2));
    }

    @Override
    public boolean condicionPropia(Alma a1) {
        return a1.getNivelValor()<50;
    }
}
