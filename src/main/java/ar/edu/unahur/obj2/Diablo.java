package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.Comparator;

public class Diablo {
    ArrayList<Demonio> listaDeDemonios = new ArrayList<Demonio>();
    public void totalDeAlmasCazadas(){listaDeDemonios.forEach(demonio-> demonio.almasDeTodosLosLugares());}
    public Demonio obtenerDemonio(){listaDeDemonios.stream().filter(demonio -> demonio.cantidad())}
    public Alma laMasValiente(){
       Alma almaMax=listaDeDemonios.get(1).almasMasValiente();
        for(int i=1;i<listaDeDemonios.size()-1;i++){
          Alma  almaDemon=listaDeDemonios.get(i).almasMasValiente();
            if(almaDemon.getValor()>almaMax.getValor()){
                almaMax=almaDemon;
            }
        }
        return almaMax;
    }
}
