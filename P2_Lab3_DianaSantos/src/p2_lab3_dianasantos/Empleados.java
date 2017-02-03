
package p2_lab3_dianasantos;

import java.util.ArrayList;


public class Empleados extends Personas {
    private int HorasTrabajo; 
    private ArrayList<Clientes> cliente = new ArrayList();

    public Empleados() {
        super();
    }

    public Empleados(int HorasTrabajo, String Nombre, String ID, int edad, int altura, int pesoP) {
        super(Nombre, ID, edad, altura, pesoP);
        this.HorasTrabajo = HorasTrabajo;
    }

    public int getHorasTrabajo() {
        return HorasTrabajo;
    }

    public void setHorasTrabajo(int HorasTrabajo) {
        this.HorasTrabajo = HorasTrabajo;
    }

    public ArrayList<Clientes> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Clientes> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados:" + "HorasTrabajo=" + HorasTrabajo + ", cliente=" + cliente + '}';
    }
    
    
}
