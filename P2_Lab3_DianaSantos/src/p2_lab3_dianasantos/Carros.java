
package p2_lab3_dianasantos;

import java.awt.Color;
import java.util.Date;


public class Carros {
    protected String NSerie;
    protected Date Ensamble;
    protected Color Pintura;
    protected String MarcaLlantas;
    protected String Polarizado;

    public Carros() {
    }

    public Carros(String NSerie, Date Ensamble, Color Pintura, String MarcaLlantas, String Polarizado) {
        this.NSerie = NSerie;
        this.Ensamble = Ensamble;
        this.Pintura = Pintura;
        this.MarcaLlantas = MarcaLlantas;
        this.Polarizado = Polarizado;
    }

    public String getNSerie() {
        return NSerie;
    }

    public void setNSerie(String NSerie) {
        this.NSerie = NSerie;
    }

    public Date getEnsamble() {
        return Ensamble;
    }

    public void setEnsamble(Date Ensamble) {
        this.Ensamble = Ensamble;
    }

    public Color getPintura() {
        return Pintura;
    }

    public void setPintura(Color Pintura) {
        this.Pintura = Pintura;
    }

    public String getMarcaLlantas() {
        return MarcaLlantas;
    }

    public void setMarcaLlantas(String MarcaLlantas) {
        this.MarcaLlantas = MarcaLlantas;
    }

    public String getPolarizado() {
        return Polarizado;
    }

    public void setPolarizado(String Polarizado) {
        this.Polarizado = Polarizado;
    }

    @Override
    public String toString() {
        return "Carros{" + "NSerie=" + NSerie + ", Ensamble=" + Ensamble + ", Pintura=" + Pintura + ", MarcaLlantas=" + MarcaLlantas + ", Polarizado=" + Polarizado + '}';
    }
    
    
    
    
    
}
