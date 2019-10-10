package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class Lugar {
    ArrayList<Alma> almasDelLugar = new ArrayList<>();
    public void agregarAlma(Alma a1){
        almasDelLugar.add(a1);}

    public ArrayList<Alma> getAlmasDelLugar() {
        return almasDelLugar;
    }

    public void removerAlma(Alma a1){almasDelLugar.remove(a1);}
}
