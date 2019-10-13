package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.stream.Stream;

public abstract class Demonio {
    int nivelDeMaldad;
    int cantidadDeAlmas;
    ArrayList<Alma> almasJodidas = new ArrayList<Alma>();
    ArrayList<Alma> almasCazadas = new ArrayList<Alma>();
   // ArrayList<Alma> almasAtormentadas = new ArrayList<>();

    public Demonio(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }
    public int getNivelDeMaldad(int count) {
        return nivelDeMaldad;
    }

    public void setNivelDeMaldad(int nivelDeMaldad) {
        this.nivelDeMaldad = nivelDeMaldad;
    }

    //PRIMERA FORMA LAMBDA---> sale a cazar
    public void cazarAlma(LugarDeAlma l1){salirACazar(l1).forEach((a1) ->
    {almasCazadas.add(a1) ; l1.conjuntoDeAlmas.remove(a1);setNivelDeMaldad((int) (getNivelDeMaldad((((int) salirACazar(l1).count()))*2)+almasJodidas.stream().count()));
    });
        almasQueEstanJodidas(l1).forEach(alma -> almasJodidas.add(alma));}

    //SEGUNDA FORMA LAMBDA
    public Stream<Alma> salirACazar(LugarDeAlma l1){return l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(puedeCazar(a1))&&(condicionPropia(a1)));}
    //la negativa ---> (!SALIRACAZAR)
    public Stream<Alma> almasQueEstanJodidas(LugarDeAlma l1){return l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(!puedeCazar(a1))&&(!condicionPropia(a1)));}

    public boolean puedeCazar(Alma a1){return nivelDeMaldad>a1.getNivelBondad();}
    //NO ENTENDI SI SE RESTA 5 O SE SETEA EN 5.
    public void atormentarAlmas(){almasJodidas.forEach((alma ->{ alma.setNivelBondad(alma.getNivelBondad()-5) ; /*almasAtormentadas.add(alma) */}));}
    public abstract boolean condicionPropia(Alma a1);
}
//ToDo //////////////////////////////OPCIONAL/////////////////////////////
//public int cantidadDeAlmasCazadas(LugarDeAlma l1){return(int) l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(!puedeCazar(a1))&&(!condicionPropia(a1))).count();}
// public  int cantidadDeAlmasJodidas(LugarDeAlma l1){ return (int) l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(puedeCazar(a1))&&(condicionPropia(a1))).count();}