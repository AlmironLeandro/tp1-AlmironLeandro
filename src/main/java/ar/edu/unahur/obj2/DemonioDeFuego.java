package ar.edu.unahur.obj2;

public class DemonioDeFuego extends Demonio {


    //ToDo arreglar para cazar alma determinada, comprension de lectura invalida...
    @Override
    public boolean puedeCazar(Alma a1){
        if (a1.getBondad() < getNivelDeMaldad() && !a1.esFrioleanta()) {
            return true;
        }
        else {
            return false;
        }
    }

    public void cazarAlma(Lugar c1) {
        saleACazar();
        c1.almasDelLugar.stream()
                .filter(alma -> alma.getBondad() < getNivelDeMaldad())
                .filter(alma -> !alma.esFrioleanta())
                .forEach(alma ->{ almasCazadas.add(alma);cantidadDeAlmasCazadas+=2;});
                c1.almasDelLugar.removeAll(almasCazadas);
    }
    @Override
    public void atormentarAlmaEspecifica(Alma a1) {
        super.atormentarAlmaEspecifica(a1);
        a1.setFriolenta(false);almasAtormentadas.add(a1);
    }
    @Override
    public void atormentarAlmas() {
        super.atormentarAlmas();
        todosLosLugares.stream()
                .forEach(lugar -> lugar.getAlmasDelLugar().stream()
                        .forEach(alma -> {
                            alma.setFriolenta(false) ; almasAtormentadas.add(alma);
                        }));
    }
}
