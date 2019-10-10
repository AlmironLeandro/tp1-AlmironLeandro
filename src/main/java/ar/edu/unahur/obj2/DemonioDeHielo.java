package ar.edu.unahur.obj2;

public class DemonioDeHielo extends Demonio{
    @Override
    public boolean puedeCazar(Alma a1){
        if (a1.getBondad() < getNivelDeMaldad() && a1.esFrioleanta()) {
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
                    .filter(alma -> alma.esFrioleanta())
                    .forEach(alma -> almasCazadas.add(alma));
                    c1.almasDelLugar.removeAll(almasCazadas);
        }
    @Override
    public void atormentarAlmas() {
        super.atormentarAlmas();
        todosLosLugares.stream().forEach(lugar -> lugar.getAlmasDelLugar().stream()
                .forEach(alma -> {
                    alma.setFriolenta(true) ; almasAtormentadas.add(alma);
                }));
    }
    @Override
    public void atormentarAlmaEspecifica(Alma a1) {
        super.atormentarAlmaEspecifica(a1);
        a1.setFriolenta(true);almasAtormentadas.add(a1);
    }

    }

