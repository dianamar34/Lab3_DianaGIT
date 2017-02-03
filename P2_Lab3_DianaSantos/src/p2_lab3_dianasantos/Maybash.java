
package p2_lab3_dianasantos;

import java.awt.Color;
import java.util.Date;


public class Maybash extends Carros{
    private int CantLlantas; // 1 o 2 se venden
    private int VelocidadM; //de 155 a 160 km/h
    private int recorridoG; //de 50 a 55 km/gal
    private int PrecioVenta; //400,000 y Lps. 600,000

    public Maybash() {
        super();
    }

    public Maybash(int CantLlantas, int VelocidadM, int recorridoG, int PrecioVenta, String NSerie, Date Ensamble, Color Pintura, String MarcaLlantas, String Polarizado) {
        super(NSerie, Ensamble, Pintura, MarcaLlantas, Polarizado);
        this.CantLlantas = CantLlantas;
        this.VelocidadM = VelocidadM;
        this.recorridoG = recorridoG;
        this.PrecioVenta = PrecioVenta;
    }

    public int getCantLlantas() {
        return CantLlantas;
    }

    public void setCantLlantas(int CantLlantas) {
        this.CantLlantas = CantLlantas;
    }

    public int getVelocidadM() {
        return VelocidadM;
    }

    public void setVelocidadM(int VelocidadM) {
        this.VelocidadM = VelocidadM;
    }

    public int getRecorridoG() {
        return recorridoG;
    }

    public void setRecorridoG(int recorridoG) {
        this.recorridoG = recorridoG;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    @Override
    public String toString() {
        return super.toString() + "Maybash:" + "\nCantLlantas=" + CantLlantas + ", VelocidadM=" + VelocidadM + ", recorridoG=" + recorridoG + ", PrecioVenta=" + PrecioVenta + '}';
    }
    
    
}
