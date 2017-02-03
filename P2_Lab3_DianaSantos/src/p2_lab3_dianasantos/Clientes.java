
package p2_lab3_dianasantos;

import java.util.ArrayList;


public class Clientes extends Personas{
    private int Dinero;
    private ArrayList<Carros> comprados = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(int Dinero, String Nombre, String ID, int edad, int altura, int pesoP) {
        super(Nombre, ID, edad, altura, pesoP);
        this.Dinero = Dinero;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<Carros> getComprados() {
        return comprados;
    }

    public void setComprados(ArrayList<Carros> comprados) {
        this.comprados = comprados;
    }

    @Override
    public String toString() {
        return super.toString() + "Clientes:" + "\nDinero=" + Dinero + ", comprados=" + comprados + '}';
    }
    
    
}
