package ar.edu.unahur.obj2;

import java.util.ArrayList;

    public abstract class Demonio {
        Alma a1;
        int max= 0;
        int maldad,cantidad,cantidadDeAlmasCazadas;
        ArrayList<Lugar> todosLosLugares = new ArrayList<Lugar>();
        ArrayList<Alma> almasCazadas = new ArrayList<Alma>();
        ArrayList<Alma> almasAtormentadas = new ArrayList<Alma>();

    public int getCantidad() {
        return cantidad;
    }


    public ArrayList<Lugar> getTodosLosLugares() {
        return todosLosLugares;
    }

    public ArrayList<Alma> getAlmasCazadas() {
        return almasCazadas;
    }

    public Alma almasMasValiente(){
        for (Alma a:almasCazadas
             ) {
            if(a.getValor() > max){
                max=a.getValor();
                a1= a;
            }
        }
        return a1;

    }
    public int getNivelDeMaldad(){return maldad;}

    public int cantidadDeAlmasDeTodosLosLugares(){
     todosLosLugares.stream().forEach(lugar -> cantidad +=lugar.almasDelLugar.size());return cantidad; }
        public void almasDeTodosLosLugares(){
            todosLosLugares.stream().forEach(lugar -> lugar.getAlmasDelLugar()); }

     public void saleACazar(){ maldad+=almasAtormentadas.size(); }

    public void atormentarAlmas(){todosLosLugares.stream().forEach(lugar -> lugar.getAlmasDelLugar().forEach(alma -> alma.bondad-=5));}

    public abstract void cazarAlma(Lugar c1);
    public  void atormentarAlmaEspecifica(Alma a1){a1.bondad-=5;};
    public abstract boolean puedeCazar(Alma a1);
}
