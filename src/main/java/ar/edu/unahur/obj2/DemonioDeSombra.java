package ar.edu.unahur.obj2;

public class DemonioDeSombra extends Demonio{
    @Override
    public boolean puedeCazar(Alma a1){
        if (a1.getBondad() < getNivelDeMaldad() && a1.getValor()<50) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public void cazarAlma(Lugar c1) {
            c1.almasDelLugar.stream()
                    .filter(alma -> alma.getBondad() < getNivelDeMaldad())
                    .filter(alma -> alma.getValor()<50)
                    .forEach(alma -> almasCazadas.add(alma));
                    c1.almasDelLugar.removeAll(almasCazadas);
    }
    @Override
    public void atormentarAlmas() {
        super.atormentarAlmas();
        todosLosLugares.stream().forEach(lugar -> lugar.getAlmasDelLugar().forEach(alma -> alma.setValor(alma.getValor()/2)));
    }
    @Override
    public void atormentarAlmaEspecifica(Alma a1) {
        super.atormentarAlmaEspecifica(a1);
        a1.setValor(a1.getValor()/2);almasAtormentadas.add(a1);
    }

}

