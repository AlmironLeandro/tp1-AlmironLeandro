package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public abstract class Demonio {
    int nivelDeMaldad;
    ArrayList<Alma> almasJodidas = new ArrayList<Alma>();
    ArrayList<Alma> almasCazadas = new ArrayList<Alma>();

    public Demonio(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }
    public int getNivelDeMaldad(int count) {
        return nivelDeMaldad;
    }
    public void setNivelDeMaldad(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }
    public ArrayList<Alma> getAlmasJodidas() {
        return almasJodidas;
    }
//ToDo verificar
    //PRIMERA FORMA LAMBDA---> sale a cazar
    public void cazarAlma(LugarDeAlma l1){ salirACazar(l1).forEach((alma) ->
    {almasCazadas.add(alma) ;setNivelDeMaldad((int) (getNivelDeMaldad((((int) salirACazar(l1).count()))*2)+almasJodidas.stream().count()));
    });
        almasQueEstanJodidasAgregadas(l1);
        eliminarAlmasCazadas(l1);
    }
    public void eliminarAlmasCazadas(LugarDeAlma l1){l1.conjuntoDeAlmas.removeAll(Arrays.asList(salirACazar(l1).toArray()));}
    //SEGUNDA FORMA LAMBDA
    public Stream<Alma> salirACazar(LugarDeAlma l1){return l1.getConjuntoDeAlmas().stream().filter(alma -> puedeCazar(alma));}
    //la negativa ---> (!SALIRACAZAR)
    public void almasQueEstanJodidasAgregadas(LugarDeAlma l1){l1.getConjuntoDeAlmas().stream().filter(alma -> !puedeCazar(alma)).forEach(alma -> almasJodidas.add(alma));}

    public boolean puedeCazar(Alma a1){return nivelDeMaldad>a1.getNivelBondad() && condicionPropia(a1);}
    //NO ENTENDI SI SE RESTA 5 O SE SETEA EN 5.
    public void atormetarAlmaParticular(Alma a1){a1.setNivelBondad(a1.getNivelBondad()-5);}
    public void atormentarAlmas(){almasJodidas.forEach((alma ->{ alma.setNivelBondad(alma.getNivelBondad()-5) ; /*almasAtormentadas.add(alma) */}));}
    public abstract boolean condicionPropia(Alma a1);
}
//ToDo              OPCIONAL
/*
    public int cantidadDeAlmasCazadas(LugarDeAlma l1){return(int) l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(!puedeCazar(a1))&&(!condicionPropia(a1))).count();}
    public  int cantidadDeAlmasJodidas(LugarDeAlma l1){ return (int) l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(puedeCazar(a1))&&(condicionPropia(a1))).count();}
    int cantidadDeAlmas;
    ArrayList<Alma> almasAtormentadas = new ArrayList<>();
 */