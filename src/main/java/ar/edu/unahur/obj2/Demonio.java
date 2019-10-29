package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public abstract class Demonio {
    Alma a1;
    int max= 0;
    int nivelDeMaldad;
    ArrayList<Alma> almasJodidas = new ArrayList<Alma>();
    ArrayList<Alma> almasCazadas = new ArrayList<Alma>();
    public int getNivelDeMaldad() {
        return nivelDeMaldad;
    }
    public ArrayList<Alma> getAlmasCazadas() {
        return almasCazadas;
    }
    public Alma almasMasValiente(){
        for (Alma a:almasCazadas
        ) {
            if(a.getNivelValor() > max){
                max=a.getNivelValor();
                a1= a;
            }
        }
        return a1;

    }
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
    public int numeroDeAlmas(){return almasCazadas.size();}
//ToDo verificar
    //PRIMERA FORMA LAMBDA---> sale a cazar
    public void cazarAlma(LugarDeAlma l1){ salirACazar(l1).forEach((alma) ->
    {almasCazadas.add(alma) ;
    });
        setNivelDeMaldad((int) (getNivelDeMaldad((((int) salirACazar(l1).count()))*2)+almasJodidas.stream().count()));
        almasQueEstanJodidasAgregadas(l1);
        eliminarAlmasQueYaEstanCazadas(l1);
    }

    //SEGUNDA FORMA LAMBDA
    public Stream<Alma> salirACazar(LugarDeAlma l1){return l1.getConjuntoDeAlmas().stream().filter(alma -> puedeCazar(alma));}
    //la negativa ---> (!SALIRACAZAR)
    public void almasQueEstanJodidasAgregadas(LugarDeAlma l1){l1.getConjuntoDeAlmas().stream().filter(alma -> !puedeCazar(alma)).forEach(alma -> almasJodidas.add(alma));}
    public void eliminarAlmasQueYaEstanCazadas(LugarDeAlma l1){l1.conjuntoDeAlmas.removeAll(Arrays.asList(salirACazar(l1).toArray()));}
    public boolean puedeCazar(Alma a1){return nivelDeMaldad>a1.getNivelBondad() && condicionPropia(a1);}
    public void atormetarAlmaParticular(Alma a1){a1.setNivelBondad(a1.getNivelBondad()-5);}
    public void atormentarAlmas(){almasJodidas.forEach((alma ->{ alma.setNivelBondad(alma.getNivelBondad()-5) ; /*almasAtormentadas.add(alma) */}));}
    public abstract boolean condicionPropia(Alma a1);


}




//ToDo  Verificar que puede ser util de estas funciones que hice
/*
    public int cantidadDeAlmasCazadas(LugarDeAlma l1){return(int) l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(!puedeCazar(a1))&&(!condicionPropia(a1))).count();}
    public  int cantidadDeAlmasJodidas(LugarDeAlma l1){ return (int) l1.getConjuntoDeAlmas().stream().filter((Alma a1)->(puedeCazar(a1))&&(condicionPropia(a1))).count();}
    int cantidadDeAlmas;
    ArrayList<Alma> almasAtormentadas = new ArrayList<>();
 */