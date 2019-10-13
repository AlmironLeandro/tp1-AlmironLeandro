package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class LugarDeAlma {
    ArrayList<Alma> conjuntoDeAlmas = new ArrayList<Alma>();

    public LugarDeAlma(ArrayList<Alma> conjuntoDeAlmas) {
        this.conjuntoDeAlmas = conjuntoDeAlmas;
    }

    public ArrayList<Alma> getConjuntoDeAlmas() {
        return conjuntoDeAlmas;
    }
}
