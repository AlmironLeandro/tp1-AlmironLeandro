package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Diablo {
    ArrayList<Demonio> demonios = new ArrayList<Demonio>();
    private Alma a1 = new Alma();
    Alma maxima;

    public ArrayList<Demonio> getDemonios() {
        return demonios;
    }

    public void agregarDemonio(Demonio d1) {
        demonios.add(d1);
    }

    public void almasCazadasPorDemonios() { demonios.forEach(demonio -> demonio.getAlmasCazadas()); }
    public Demonio demonioConMasAlmas(){
        Demonio d1= demonios.get(1);
        for(int i=0;i<demonios.size();i++){
            if(demonios.get(i).numeroDeAlmas()> d1.numeroDeAlmas()){
                d1=demonios.get(i);
            }
        }
        return d1;
    }
    public Alma laMasValiente(){
        Alma almaMax=demonios.get(1).almasMasValiente();
        for(int i=1;i<demonios.size()-1;i++){
            Alma  almaDemon=demonios.get(i).almasMasValiente();
            if(almaDemon.getNivelValor()>almaMax.getNivelValor()){
                almaMax=almaDemon;
            }
        }
        return almaMax;
    }

}
