package ar.edu.unahur.obj2;

import java.util.ArrayList;

public class Alma {
    int bondad;
    private boolean friolenta,seguir;
    int valor;

    public void setFriolenta(boolean friolenta) {
        this.friolenta = friolenta;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getBondad(){return bondad;}
    public int getValor(){return valor;}
    //ToDo mejorar este metodo
    public boolean esFrioleanta(){return friolenta;}

}
