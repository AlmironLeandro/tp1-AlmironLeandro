package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class LugarDeAlma {
    ArrayList<Alma> conjuntoDeAlmas = new ArrayList<Alma>();


    public ArrayList<Alma> getConjuntoDeAlmas() {
        return conjuntoDeAlmas;
    }
    public void agregarAlma(Alma a1){conjuntoDeAlmas.add(a1);}
    public void removerAlma(Alma a1){conjuntoDeAlmas.remove(a1);}
}
