package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Diablo {
    ArrayList<Demonio> demonios = new ArrayList<Demonio>();
    private Alma a1  = new Alma();
    Alma maxima;

    public ArrayList<Demonio> getDemonios() {
        return demonios;
    }
    public void agregarDemonio(Demonio d1){demonios.add(d1);}
    public void almasCazadasPorDemonios(){ demonios.forEach(demonio -> demonio.getAlmasCazadas());}
   // public Demonio
    //ToDo Reparar esta Funcion
   /* public void almaMasValiente(){demonios.stream().forEach(demonio ->
        demonio.getAlmasCazadas().stream().filter(alma -> {
            if (alma.getNivelValor() > maxima.getNivelValor()) {
                alma = maxima;
            }
        }));}

    */

}
